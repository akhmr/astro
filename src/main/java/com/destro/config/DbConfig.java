package com.destro.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.destro.entity.repo")
@EntityScan("com.destro.entity.*)")
public class DbConfig {

    @Autowired
    private Environment env;

	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		return dataSourceBuilder
				.driverClassName(env.getProperty("jdbc.driverClassName"))
				.url(env.getProperty("jdbc.url"))
				.username(env.getProperty("jdbc.username"))
				.password(env.getProperty("jdbc.password"))
				.build();

	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		System.out.println("creating em");
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource);
		em.setPackagesToScan("com.destro.entity");
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());   
		return em;
	}

	
	 @Bean
	  public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {

	    JpaTransactionManager txManager = new JpaTransactionManager();
	    txManager.setEntityManagerFactory(entityManagerFactory);
	    return txManager;
	  }
	 
	 Properties hibernateProperties() {
	      return new Properties() {
	        private static final long serialVersionUID = 1L;

	        {
	            setProperty("hibernate.show_sql", "false");
	            setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	         }
	      };
	   }

}
