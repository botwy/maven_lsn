package com.spring_jdbc;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan
public class SJMain {
    public static void main(String... args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SJMain.class);
        SpringJDBC springJDBC = context.getBean(SpringJDBC.class);

    }


    @Bean
    public DriverManagerDataSource dataSource() {
        return new DriverManagerDataSource("jdbc:h2:./test_spring", "sa", "");
    }

    @Bean
    public DriverManagerDataSource dataSource1() {
        return new DriverManagerDataSource("jdbc:h2:./test_10", "sa", "");
    }

   /* @Bean
    public SpringJDBC getSpringJDBC(DataSource dataSource) {
        return new SpringJDBC(dataSource);
    }
*/

}
