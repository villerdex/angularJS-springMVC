package main.Controller;

import main.Configs.ServicesConfig;
import main.Model.Person;
import main.Model.Response;
import main.Services.PersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Didoy on 3/20/2017.
 */

@RestController
@RequestMapping("/person")
public class PersonRestController {

    AnnotationConfigApplicationContext serviceContext = new AnnotationConfigApplicationContext(ServicesConfig.class);
    PersonDAO personDAO = serviceContext.getBean(PersonDAO.class);


    @RequestMapping(value = "/getPerson", method = RequestMethod.GET)
    public List <Person> getPerson(){

        List<Person> personArrayList = null;
        Person p = new Person();

        personArrayList = personDAO.getAllPerson();

        return personArrayList;
    }

    @RequestMapping(value = "/addPerson", method = RequestMethod.POST,  produces = "application/json")
    public ResponseEntity<Response>  addPerson(@RequestBody Person person){

        boolean success = personDAO.createPerson(person);

        Response response = new Response();
        response.setSuccess(success);
        return   new ResponseEntity<Response>(response, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/updatePerson", method = RequestMethod.POST,  produces = "application/json")
    public ResponseEntity<Response>  updatePerson(@RequestBody Person person){

        boolean success =  personDAO.updatePerson(person);

        Response response = new Response();
        response.setSuccess(success);

        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/deletePerson", method = RequestMethod.POST,  produces = "application/json")
    public ResponseEntity<Response>  deletePerson(@RequestBody int id){

        boolean success =  personDAO.deletePerson(id);

        Response response = new Response();
        response.setSuccess(success);

        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }
}
