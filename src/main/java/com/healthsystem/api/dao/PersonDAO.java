
package com.healthsystem.api.dao;

import com.healthsystem.api.models.Person;
import java.util.List;

public interface PersonDAO {
    Person findById(long id);
    List<Person> findAll();
    Person save(Person person);
    Person update(Person person);
    void delete(long id);
}
