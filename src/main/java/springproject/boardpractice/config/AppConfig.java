package springproject.boardpractice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springproject.boardpractice.repository.MemberRepository;

@Configuration
public class AppConfig implements WebMvcConfigurer {
    private final MemberRepository memberRepository;

    public AppConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/").setViewName("home");
    }
}
