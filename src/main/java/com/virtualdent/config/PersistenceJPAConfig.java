package com.virtualdent.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages={"com.virtualdent.repository"})
@EnableTransactionManagement
public class PersistenceJPAConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory()
	{
		LocalEntityManagerFactoryBean factoryBean=new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("VirtualDentalClinic");
		return factoryBean;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory)
	{
		JpaTransactionManager transactionManager=new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
	
	
}
