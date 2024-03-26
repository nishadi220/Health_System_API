
package com.healthsystem.api.models;

public class Person {
    private long id;
    private String name;
    private String contactInformation;
    private String address;

    public Person() {}

    public Person(long id, String name, String contactInformation, String address) {
        this.id = id;
        this.name = name;
        this.contactInformation = contactInformation;
        this.address = address;
    }

    // Getters and Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getContactInformation() { return contactInformation; }
    public void setContactInformation(String contactInformation) { this.contactInformation = contactInformation; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
