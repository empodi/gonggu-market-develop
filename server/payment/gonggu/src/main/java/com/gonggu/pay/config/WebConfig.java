package com.gonggu.pay.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String basicPath = System.getProperty("user.dir")+ "/files/";
        registry.addResourceHandler("/image/**")
                .addResourceLocations("file:///"+basicPath); //root에서 시작하는 폴더 경로
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                //.allowedOrigins("http://localhost:3000")
                .allowedOriginPatterns("*")
                .exposedHeaders("Set-Cookie")
                .allowCredentials(true);
    }
}