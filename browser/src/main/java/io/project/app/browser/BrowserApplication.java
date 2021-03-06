package io.project.app.browser;

import brave.sampler.Sampler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"io.project"})
@EntityScan("io.project.app.domain")
@EnableDiscoveryClient
@EnableEurekaClient
public class BrowserApplication {

    public static void main(String[] args) {
        final SpringApplication application = new SpringApplication(BrowserApplication.class);
        application.setBannerMode(Banner.Mode.CONSOLE);
        application.setWebApplicationType(WebApplicationType.REACTIVE);
        application.run(args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Sampler sampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
    
    @Bean
    public CloseableHttpClient httpClient(){
         return HttpClients.createDefault();
    }

}
