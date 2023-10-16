package com.example.csc311_module7_hw;

/**
 * Represents a person entity with fields corresponding to a database table.
 */
public class Person {

    // Fields corresponding to columns in the table
    private Integer id;
    private String name;  // Changed from Name to name
    private String email;
    private int phone;
    private String password;
    private int salary;  // Added salary field

    /**
     * Default constructor for the Person class.
     */
    public Person() {
        this.id = 0;
        this.name = "";
        this.email = "";
        this.phone = 0;
        this.password = "";
        this.salary = 0;
    }

    /**
     * Constructs a Person object with the specified attributes.
     *
     * @param id       The unique identifier of the person.
     * @param name     The name of the person.
     * @param email    The email of the person.
     * @param phone    The phone of the person.
     * @param password The password of the person.
     * @param salary   The salary of the person.
     */
    public Person(Integer id, String name, String email, int phone, String password, int salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.salary = salary;
    }

    // Getter and Setter methods for all fields (id, name, email, phone, password, salary) go here

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
