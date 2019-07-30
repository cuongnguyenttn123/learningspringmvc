package cuongnguyen.tt.service;

import cuongnguyen.tt.entity.UserEntity;
import cuongnguyen.tt.reponsitory.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserReponsitory userReponsitory;

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserEntity userEntity = userReponsitory.findByUserName(s);
        if (userEntity == null){
            return null;
        }
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        return new User(userEntity.getUserName(), userEntity.getPassWord(), enabled, accountNonExpired,
                credentialsNonExpired, accountNonLocked, userEntity.getAuthorities());
    }
}
