package beat.mercy.conf.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

//@Configuration
@EnableGlobalMethodSecurity(securedEnabled=true)
public class ConfigureSecureAnnotation {

}
