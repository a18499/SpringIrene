package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by a1849 on 2016/11/27.
 */
@Configuration
public class WebMvcController extends WebMvcConfigurerAdapter {
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/pt").setViewName("/pt");
    }
}
