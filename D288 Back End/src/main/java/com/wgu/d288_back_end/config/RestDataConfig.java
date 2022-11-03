package com.wgu.d288_back_end.config;

import com.wgu.d288_back_end.entities.Excursion;
import com.wgu.d288_back_end.entities.Vacation;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestDataConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Vacation.class);
        config.exposeIdsFor(Excursion.class);
    }

}