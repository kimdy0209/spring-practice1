//package springproject.boardpractice.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    protected SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        http.authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/detail/**","/editview","/write","/edit/**").hasRole("USER")
//                        .requestMatchers("/**","/register").permitAll()
//
//                );
//        http.formLogin(form -> form
//                .loginPage("/login")
//                .defaultSuccessUrl("/list")
//                .permitAll()
//        );
//
//        http.logout(lout->lout
//                .logoutSuccessUrl("/")
//                .permitAll()
//        );
//        return http.build();
//    }
//
//}
