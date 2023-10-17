package ru.liga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
@EnableJpaRepositories
@EnableConfigurationProperties
public class Delivery
{
    public static void main( String[] args )
    {
        SpringApplication.run(Delivery.class, args);
    }
}
