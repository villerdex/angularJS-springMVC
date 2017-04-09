package main.ServicesImp;

import main.Model.Person;
import main.Services.PersonDAO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Didoy on 4/7/2017.
 */
public class PersonService implements PersonDAO {

    private JdbcTemplate jdbcTemplate;

    private RowMapper rowMapper = new RowMapper() {
        public Person mapRow(ResultSet rs, int i) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("Id"));
            person.setName(rs.getString("Name"));
            person.setAddress(rs.getString("address"));
            person.setAge(rs.getInt("age"));
            return person;
        }
    };

    public boolean createPerson(Person person) {

        String sql = "Insert into person (name, age, address) VALUES (?, ?, ?)";
        int row = jdbcTemplate.update(sql, person.getName(),
                            person.getAge(),
                            person.getAddress());

        boolean success = row > 0;
        return success;
    }

    public boolean updatePerson( Person person) {

        String sql = "UPDATE person SET name = ?, age = ?, address = ? WHERE id = ?";

        int row = jdbcTemplate.update(sql, person.getName(),
                person.getAge(),
                person.getAddress(),
                person.getId());

        boolean success = row > 0;

        return success;
    }

    public boolean deletePerson(int id) {
        String sql = "DELETE FROM person  WHERE id = ?";

        int row = jdbcTemplate.update(sql, id);

        boolean success = row > 0;

        return success;
    }

    public Person getPerson(int id) {

        String sql = "select * from person where id = ?";
        Person person = (Person) jdbcTemplate.queryForObject(sql,new Object[]{id}, rowMapper);

        return person;
    }

    public List<Person> getAllPerson(){

        List list = null;

         String sql = "select * from person";
         list =  jdbcTemplate.query(sql,new Object[]{}, rowMapper);

        return list;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
