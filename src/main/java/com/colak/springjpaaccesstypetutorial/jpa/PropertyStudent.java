package com.colak.springjpaaccesstypetutorial.jpa;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Use use getter and setter methods
 */
@Entity
@Access(AccessType.PROPERTY)

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class PropertyStudent {

    private int id;

    private String firstName;
    private String lastName;

    @Id
    public int getId() {
        log.info("getting id");
        return id;
    }

    public void setId(int id) {
        log.info("setting id");
        this.id = id;
    }

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
}
