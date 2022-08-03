package co.com.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author jpatarroyo
 */
public class EncryptPassword {
    
    /**
     * Method to encrypt the password
     * @param password
     * @return 
     */
    public static String encryptPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
    
    
}
