package com.colak.springjpaaccesstypetutorial.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Even though the default access type for the class is field, the introduction of @Id on top of the getter method
 * changes the default for the entire class to property.
 */
@Entity

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String firstName;
    private String lastName;

    public String getLastName() {
        log.info("getting lastname");
        return lastName;
    }

    public void setLastName(String lastName) {
        log.info("setting lastname");
        this.lastName = lastName;
    }

    public String getFirstName() {
        log.info("getting firstname");
        return firstName;
    }

    public void setFirstName(String firstName) {
        log.info("setting firstname");
        this.firstName = firstName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        log.info("getting id");
        return id;
    }

    public void setId(long id) {
        log.info("setting id");
        this.id = id;
    }
}
