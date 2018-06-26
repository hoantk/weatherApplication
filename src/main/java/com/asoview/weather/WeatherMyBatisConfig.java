package com.asoview.weather;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableCaching
@MapperScan(basePackages = "com.asoview.weather.datasource")
public class WeatherMyBatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setTypeHandlers(new TypeHandler[] {
                new org.apache.ibatis.type.LocalDateTimeTypeHandler(),
                new org.apache.ibatis.type.LocalDateTypeHandler(),
                new org.apache.ibatis.type.LocalTimeTypeHandler()
        });
        return sessionFactory.getObject();
    }
}
