package ru.alishev.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    public static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT,"Tom",24,"tom@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT,"Bob",52,"bob@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT,"Mike",18, "mike@myahoo.com"));
        people.add(new Person(++PEOPLE_COUNT,"Katy",34,"katy@gmail.com"));
    }
    public List<Person> index(){
        return people;
    }
    public Person show (int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
    public void save (Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
    public void update (int id, Person uddatedPerson){
        Person personTobeUpdated = show(id);

        personTobeUpdated.setName(uddatedPerson.getName());
        personTobeUpdated.setAge(uddatedPerson.getAge());
        personTobeUpdated.setEmail(uddatedPerson.getEmail());
    }
    public void delete (int id){
        people.removeIf(p -> p.getId() == id);
    }
}
