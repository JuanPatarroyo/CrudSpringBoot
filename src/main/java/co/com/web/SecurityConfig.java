package co.com.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author jpatarroyo
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("{noop}admin123").roles("ADMIN", "USER")
                .and().withUser("juanes").password("{noop}juanes123").roles("USER");
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/update/**","/actionPerson/**","/delete").hasRole("ADMIN")
                .antMatchers("/").hasAnyRole("USER","ADMIN")
                .and().formLogin().loginPage("/login")
                .and().exceptionHandling().accessDeniedPage("/errors/403");
    }
}
