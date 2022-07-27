package co.com.web;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 *
 * @author jpatarroyo
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
    
    @Bean
    public LocaleResolver localeResolver(){
        var sessionLocalResource = new SessionLocaleResolver();
        sessionLocalResource.setDefaultLocale(new Locale("en"));
        return sessionLocalResource;
    }
    
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
        var localeChange = new LocaleChangeInterceptor();
        localeChange.setParamName("lang");
        return localeChange;
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry register){
        register.addInterceptor(localeChangeInterceptor());
    }
}
