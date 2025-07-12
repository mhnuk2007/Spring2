package com.learning.config;

import com.learning.Alien;
import com.learning.Desktop;
import com.learning.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public Alien alien() {
        return new Alien();
    }

    @Bean

    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop() {
        return new Laptop();
    }


}
