package main;

import main.Configs.JdbcConfiguration;
import main.Configs.ServicesConfig;
import main.Model.Person;
import main.Services.PersonDAO;
import main.ServicesImp.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.activation.DataSource;

/**
 * Created by Didoy on 3/20/2017.
 */
@SpringBootApplication
@EnableAsync
    public class App {


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

//        AnnotationConfigApplicationContext serviceContext = new AnnotationConfigApplicationContext(ServicesConfig.class);
//        PersonDAO personDAO = serviceContext.getBean(PersonDAO.class);
//
//        Person person = new Person();
//        person.setName("Didoy");
//        person.setAddress("9998 NZ");
//        person.setAge(21);


//        // for creating
//        boolean created =  personDAO.createPerson(person);
//        System.out.println("test done " + created);
//
//        // update
//        boolean updated = personDAO.updatePerson(1, person);
//        System.out.println("test done " + updated);
//
//        // delete
//        boolean deleted = personDAO.deletePerson(1);
//        System.out.println("test done " + deleted);

        // fetch
//        Person person1 = personDAO.getPerson(2);
//        System.out.println("test done " + person1.getInfo());
    }






}
