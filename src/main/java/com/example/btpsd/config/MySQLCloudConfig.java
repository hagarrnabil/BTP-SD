//package com.example.btpsd.config;
//
//import org.springframework.cloud.config.java.AbstractCloudConfig;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//import javax.sql.DataSource;
//
//@Profile("cloud")
//@Configuration
//public class MySQLCloudConfig extends AbstractCloudConfig {
//
//    @Bean
//    public DataSource dataSource() {
//        return connectionFactory().dataSource();
//    }
//
//}
