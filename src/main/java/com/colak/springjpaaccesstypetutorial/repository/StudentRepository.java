package com.colak.springjpaaccesstypetutorial.repository;

import com.colak.springjpaaccesstypetutorial.jpa.PropertyStudent;
import com.colak.springjpaaccesstypetutorial.jpa.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
