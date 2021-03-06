package com.microservice.demo.usercenter.service.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
public class DBConfig {

    private static final Logger logger = LoggerFactory
            .getLogger(DBConfig.class);

    /**
     * 
     * 注入git配置文件信息
     * 
     * @return ConfigProperties
     */
    @Bean
    public ConfigProperties configProperties() {
        return new ConfigProperties();
    }

    /**
     * 数据源
     * 
     * @return
     */
    @Bean
    public DataSource dataSource(ConfigProperties configProperties) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(configProperties.driver);
        dataSource.setUrl(configProperties.url);
        dataSource.setUsername(configProperties.username);
        dataSource.setPassword(configProperties.password);

        logger.info("init data source : {}, driver:{}, url : {}", dataSource,
                configProperties.driver, configProperties.url);
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(
            DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);

        logger.info(
                "init DataSourceTransactionManager : {}, using dataSource : {}",
                dataSourceTransactionManager, dataSource);
        return dataSourceTransactionManager;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(dataSource);
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setCallSettersOnNulls(true);
        sqlSession.setConfiguration(configuration);
        logger.info("init SqlSessionFactoryBean : {}, using dataSource : {}",
                sqlSession, dataSource);
        return sqlSession;
    }

}
