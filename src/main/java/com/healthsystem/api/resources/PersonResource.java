
package com.healthsystem.api.resources;

import com.healthsystem.api.models.Person;
import com.healthsystem.api.dao.PersonDAO;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

    private PersonDAO personDAO = /* Initialization of DAO */;

    @GET
    public List<Person> getPersons() {
        return personDAO.findAll();
    }

    @GET
    @Path("/{id}")
    public Person getPerson(@PathParam("id") long id) {
        return personDAO.findById(id);
    }

    @POST
    public Person addPerson(Person person) {
        return personDAO.save(person);
    }

    @PUT
    @Path("/{id}")
    public Person updatePerson(@PathParam("id") long id, Person person) {
        person.setId(id);
        return personDAO.update(person);
    }

    @DELETE
    @Path("/{id}")
    public void deletePerson(@PathParam("id") long id) {
        personDAO.delete(id);
    }
}
