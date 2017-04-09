package main.Configs;

import main.Services.PersonDAO;
import main.ServicesImp.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Didoy on 4/7/2017.
 */

@Configuration
public class ServicesConfig {

    AnnotationConfigApplicationContext applicationContext;
    JdbcTemplate jdbcTemplate;

    public ServicesConfig(){

         applicationContext = new AnnotationConfigApplicationContext(
                JdbcConfiguration.class);

        jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
    }

    @Bean
    public PersonDAO personDAO(){
        PersonService personService = new PersonService();
        personService.setJdbcTemplate(jdbcTemplate);
        return personService;
    }
}
