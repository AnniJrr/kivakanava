package projekti;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration
public class DevelopmentSecurityConfiguration extends WebSecurityConfigurerAdapter {

   
       // ei vaadi kirjautumista mihinkään sivulle
    @Override
    public void configure(WebSecurity sec) throws Exception {
    
        sec.ignoring().antMatchers("/**");
    } 


    }



