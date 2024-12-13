package ru.alishev.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    public static int PEOPLE_COUNT;

    private static final String URL = "jdbc:postgresql://localhost:5432/first_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Person> index(){

        List<Person> people = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM person";
            ResultSet resultSet = statement.executeQuery(SQL); //данный метод получает данные из бд, не изменяя их

            while (resultSet.next()) {
                Person person = new Person();

                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setEmail(resultSet.getString("email"));
                person.setAge(resultSet.getInt("age"));

                people.add(person);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return people;
    }
    public Person show (int id){
//        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
        return null;
    }
    public void save (Person person){
//        person.setId(++PEOPLE_COUNT);
//        people.add(person);
        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO person VALUES (" + 1 + ",'" + person.getName() + "','" + person.getAge()
                    + "','" + person.getEmail() + "')";
            //INSERT INTO person VALUES(1, 'Tom', 18, 'tom@mail.ru')
            statement.executeUpdate(SQL); //данный метод изменяет данные в бд, не возвращая их
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void update (int id, Person uddatedPerson){
//        Person personTobeUpdated = show(id);
//
//        personTobeUpdated.setName(uddatedPerson.getName());
//        personTobeUpdated.setAge(uddatedPerson.getAge());
//        personTobeUpdated.setEmail(uddatedPerson.getEmail());
    }
    public void delete (int id){
      //  people.removeIf(p -> p.getId() == id);
    }
}
