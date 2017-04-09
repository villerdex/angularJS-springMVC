package main.Services;

import main.Model.Person;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by Didoy on 4/6/2017.
 */
public interface PersonDAO {

    public boolean createPerson(Person person);
    public boolean updatePerson( Person person);
    public boolean deletePerson(int id);
    public Person getPerson(int id);
    public List<Person> getAllPerson();
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate);

}
