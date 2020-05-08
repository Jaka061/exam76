package kg.it.task2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
        .withUser("user").password("{noop}9090").roles("USER").and()
        .withUser("admin").password("{noop}6767").roles("ADMIN").and()
        .withUser("login").password("{noop}4545").roles("USER");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/student").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/api/student").hasRole("USER")
                .antMatchers(HttpMethod.POST,"/api/student").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/api/course").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/api/student").hasRole("ADMIN")
                .and().csrf().disable();
    }



}
