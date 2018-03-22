package beat.mercy.conf.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import beat.mercy.entity.base.Account;
import beat.mercy.repository.AccountRepository;

import java.util.Collections;;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
    private AccountRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }
        // TODO 用户权限罗辑处理
        
        
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),Collections.emptyList());
    }

}
