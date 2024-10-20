package com.mehdi.Enterprise_Lektion_56_Spring_Security_Intro.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /* Static .html Pages
    * Used fpr endpoint definition.
    * Acts as an alternative to the classical annotated @Controller class
     */

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }
}
