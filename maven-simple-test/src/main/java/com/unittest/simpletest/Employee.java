package com.unittest.simpletest;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Created by akalanka on 1/16/16.
 */
public class Employee {


    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || !(object instanceof Employee)) {
            return false;
        }

        Employee other = (Employee) object;
        return new EqualsBuilder()
                .append(this.firstName, other.firstName)
                .append(this.age, other.age)
                .isEquals();
    }
}
