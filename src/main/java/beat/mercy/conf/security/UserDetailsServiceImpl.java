package beat.mercy.conf.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import beat.mercy.entity.base.Account;
import beat.mercy.entity.rbac.Authority;
import beat.mercy.entity.rbac.Role;
import beat.mercy.repository.AccountRepository;

import java.util.HashSet;
import java.util.Set;;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AccountRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account user = userRepository.findByUsernameJoinRoleAuthority(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		if(!user.isEnabled()) {
			throw new UsernameNotFoundException(username+"已被停用");
		}
		// TODO 用户权限逻辑处理
		Set<GrantedAuthority> authorities = new HashSet<>();
		for (Role role : user.getRoles()) {
			for (Authority auth : role.getAuthorities())
				authorities.add(new SimpleGrantedAuthority(auth.getName()));
		}
		return new UserPrincipal(user.getId(), user.getUsername(), user.getPassword(),
				true, // enabled
				true, // accountNonExpired
				true, // credentialsNonExpired
				true, // accountNonLocked
				authorities);
	}

}
