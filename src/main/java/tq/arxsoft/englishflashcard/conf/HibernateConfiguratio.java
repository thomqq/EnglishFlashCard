/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tq.arxsoft.englishflashcard.conf;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

/**
 *
 * @author tkudas
 */
@Configuration
public class HibernateConfiguratio {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl("jdbc:postgresql://localhost:5432/EnglishFlashCard");
        ds.setUsername("postgres");
        ds.setPassword("adminadmin");
        return ds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
        sfb.setDataSource(dataSource);
        sfb.setPackagesToScan(new String[]{"tq.arxsoft.englishflashcard"});
        Properties props = new Properties();
        props.setProperty("dialect", "org.hibernate.dialect.PostgreSQLDialect");
        sfb.setHibernateProperties(props);
        return sfb;
    }
}
