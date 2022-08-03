package co.com.service;

import co.com.dao.InterfaceUserDao;
import co.com.domain.UserControl;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jpatarroyo
 */
@Service("userDetailsService")
@Slf4j
public class UserService implements UserDetailsService{

    @Autowired
    private InterfaceUserDao userDao;
    
    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserControl user = userDao.findByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }
        var roles = new ArrayList<GrantedAuthority>();
        user.getRoles().forEach((rol -> {
            roles.add(new SimpleGrantedAuthority(rol.getName()));
        }));
        return new User(user.getUserName(), user.getPassword(), roles);
    }
    
}
