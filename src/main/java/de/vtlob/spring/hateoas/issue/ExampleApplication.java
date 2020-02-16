package de.vtlob.spring.hateoas.issue;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    @Bean
    public BeanPostProcessor exampleBeanPostProcessor(ObjectFactory<? extends ExampleComponent> exampleComponentObjectFactory) {
        exampleComponentObjectFactory.getObject();
        return new BeanPostProcessor() {};
    }
}

