package com.colak.springjpaaccesstypetutorial.repository;

import com.colak.springjpaaccesstypetutorial.jpa.FieldStudent;
import com.colak.springjpaaccesstypetutorial.jpa.PropertyStudent;
import com.colak.springjpaaccesstypetutorial.jpa.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyStudentRepository extends JpaRepository<PropertyStudent, Integer> {
}
