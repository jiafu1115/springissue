package com.spring.puzzle.others.transaction.example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${card.driver}")
    private String cardDriver;

    @Value("${card.url}")
    private String cardUrl;

    @Value("${card.username}")
    private String cardUsername;

    @Value("${card.password}")
    private String cardPassword;

    @Autowired
    @Qualifier("dataSourceCard")
    private DataSource dataSourceCard;

    @Autowired
    @Qualifier("dataSourceCore")
    private DataSource dataSourceCore;

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate createJdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }


    @Bean(name = "dataSourceCore")
    public DataSource createCoreDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }

    @Bean(name = "dataSourceCard")
    public DataSource createCardDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(cardDriver);
        ds.setUrl(cardUrl);
        ds.setUsername(cardUsername);
        ds.setPassword(cardPassword);
        return ds;
    }

    @Bean(name = "dataSource")
    public MyDataSource createDataSource() {
        MyDataSource dynamicDataSource = new MyDataSource();
        Map<Object, Object> map = new HashMap<>();
        map.put("core", dataSourceCore);
        map.put("card", dataSourceCard);
        dynamicDataSource.setTargetDataSources(map);
        dynamicDataSource.setDefaultTargetDataSource(dataSourceCore);
        return dynamicDataSource;
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager createTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
