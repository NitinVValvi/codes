package com.cjc.crud.web.utility;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cjc.crud.web.model.Student;

@EnableWebMvc
@ComponentScan(basePackages="com.cjc")
@Configuration
public class AppConfig {
@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setSuffix(".jsp");
		return irvr;
		
		
	}
@Bean
public DriverManagerDataSource dmMethod()
{
	DriverManagerDataSource dmds=new DriverManagerDataSource();
	dmds.setDriverClassName("com.mysql.jdbc.Driver");
dmds.setUrl("jdbc:mysql://localhost:3306/springcrudjavab");
dmds.setUsername("root");
dmds.setPassword("root");
return dmds;

}
@Bean
public LocalSessionFactoryBean sf()
{
LocalSessionFactoryBean lsfb=new LocalSessionFactoryBean();
lsfb.setDataSource( dmMethod());
Properties p=new Properties();
p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
p.setProperty("hibernate.hbm2ddl.auto", "update");
lsfb.setHibernateProperties(p);
lsfb.setAnnotatedClasses(Student.class);
return lsfb;



}
}