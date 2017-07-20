package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

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
