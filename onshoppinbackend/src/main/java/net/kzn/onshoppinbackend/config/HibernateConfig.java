package net.kzn.onshoppinbackend.config;

import java.util.Properties;

import javax.sql.DataSource;


import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("net.kzn.onshoppinbackend.dto")
@EnableTransactionManagement
public class HibernateConfig {
	private final static String DATABAE_Driver = "com.mysql.jdbc.Driver";
	private final static String DATABAE_URL = "jdbc:mysql://localhost:3306/studentdb";
	private final static String DATABAE_USERNAME = "root";
	private final static String DATABAE_PASSWORD = "root123";
	private final static String DATABAE_DIALECT = "MySQLDialect";
	private final static String validationQuery = "select 1";
	
	//DataSource settings
	@Bean("dataSource")
	public DataSource getDataSource()
	{
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName(DATABAE_Driver);
		dataSource.setUrl(DATABAE_URL);
		dataSource.setUsername(DATABAE_USERNAME);
		dataSource.setPassword(DATABAE_PASSWORD);
		dataSource.setValidationQuery(validationQuery);
		return (DataSource) dataSource;
	}
	
	//SessionFactory settings
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("net.kzn.onshoppinbackend.dto");
	
		return builder.buildSessionFactory();
	}
	
	
	
	
	//hiberanet properties

	public Properties getHibernateProperties()
	{
		Properties properties=new Properties();
		
		properties.put("hibernat.dialect",DATABAE_DIALECT);
		properties.put("hibernat.show_sql","true");
		properties.put("hibernat.format_sql","true");
		return properties;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager htm=new HibernateTransactionManager(sessionFactory);		
		return htm;
	}
	
}
