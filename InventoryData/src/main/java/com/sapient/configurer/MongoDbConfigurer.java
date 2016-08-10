package com.sapient.configurer;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


import java.net.UnknownHostException;

/**
 * Created by rarcot on 8/9/2016.
 */
@Configuration
@PropertySource("file:${app.home}/application.properties")
@ComponentScan(basePackages={"com.sapient.*"})
public class MongoDbConfigurer extends WebMvcConfigurerAdapter {

    @Autowired
    private Environment env;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }


    @Bean
    public MongoDbFactory mongo() throws UnknownHostException{
        MongoClient mongoClient = new MongoClient("localhost",27017);
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongoClient,"cn-inventory");
        return mongoDbFactory;
    }

    @Bean
    public MongoTemplate mongoTemplate() throws UnknownHostException{
        return new MongoTemplate(mongo());
    }
}
