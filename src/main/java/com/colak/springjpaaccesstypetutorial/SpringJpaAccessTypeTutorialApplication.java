package com.colak.springjpaaccesstypetutorial;

import com.colak.springjpaaccesstypetutorial.jpa.FieldStudent;
import com.colak.springjpaaccesstypetutorial.jpa.PropertyStudent;
import com.colak.springjpaaccesstypetutorial.jpa.Student;
import com.colak.springjpaaccesstypetutorial.repository.FieldStudentRepository;
import com.colak.springjpaaccesstypetutorial.repository.PropertyStudentRepository;
import com.colak.springjpaaccesstypetutorial.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringJpaAccessTypeTutorialApplication implements CommandLineRunner {

    @Autowired
    private FieldStudentRepository fieldStudentRepository;

    @Autowired
    private PropertyStudentRepository propertyStudentRepository;

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaAccessTypeTutorialApplication.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("----------------FieldStudent----------------------------");
        FieldStudent fieldStudent = new FieldStudent(1, "name1", "lastname1");
        // No getters are called except getLastName()
        fieldStudentRepository.save(fieldStudent);

        log.info("------------------PropertyStudent--------------------------");
        PropertyStudent propertyStudent = new PropertyStudent(1, "name1", "lastname1");
        // All getters/setters are called
        propertyStudentRepository.save(propertyStudent);

        log.info("------------------Student--------------------------");
        Student student = new Student(1, "name1", "lastname1");
        // All getters/setters are called
        studentRepository.save(student);
    }
}
