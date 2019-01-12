package io.project.app.auth;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"io.project"})
@EntityScan("io.project.app.domain")
@EnableReactiveMongoRepositories("io.project.app.repositories")
public class AuthApplication {

    
    public static void main(String[] args) {
        final SpringApplication application = new SpringApplication(AuthApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.REACTIVE);
        application.run(args);
    }   

}
