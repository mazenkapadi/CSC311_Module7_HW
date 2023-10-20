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

    /**
     * Getter method to retrieve the account holder's name.
     *
     * @return The account holder's details.
     */

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


    /**
     * Getter method to retrieve the account holder's id.
     *
     * @return The account holder's id.
     */

    public Integer getId() {
        return id;
    }

    /**
     * Setter method to set the account holder's id.
     *
     * @param id
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter method to retrieve the account holder's name.
     *
     * @return The account holder's name.
     */

    public String getName() {
        return name;
    }

    /**
     * Setter method to set the account holder's name.
     * It takes a String as a <p>parameter<p/> and returns nothing.
     *
     * @param name The new account holder's name.
     *             <p>
     *             Some text
     *             </p>
     */


    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method to retrieve the account holder's email.
     *
     * @return The account holder's email.
     */

    public String getEmail() {
        return email;
    }

    /**
     * Setter method to set the account holder's email.
     *
     * @param email The new account holder's email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter method to retrieve the account holder's phone.
     *
     * @return The account holder's phone.
     */

    public int getPhone() {
        return phone;
    }

    /**
     * Setter method to set the account holder's phone.
     *
     * @param phone The new account holder's phone.
     */

    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * Getter method to retrieve the account holder's password.
     *
     * @return The account holder's password.
     */

    public String getPassword() {
        return password;
    }

    /**
     * Setter method to set the account holder's password.
     *
     * @param password The new account holder's password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter method to retrieve the account holder's salary.
     *
     * @return The account holder's salary.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Setter method to set the account holder's salary.
     *
     * @param salary The new account holder's salary.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
