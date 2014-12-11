package config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class DsPropConfig {
	@Value("${db.driver}")
	private String driver;
	@Value("${db.jdbcUrl}")
	private String jdbcUrl;
	@Value("${db.user}")
	private String user;
	@Value("${db.password}")
	private String password;

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer =
				new PropertySourcesPlaceholderConfigurer();
		configurer.setLocation(new ClassPathResource("db.properties"));
		return configurer;
	}

	@Bean
	public DataSource dataSource() {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		try {
			ds.setDriverClass(driver);
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}
		ds.setJdbcUrl(jdbcUrl);
		ds.setUser(user);
		ds.setPassword(password);
		return ds;
	}

}
