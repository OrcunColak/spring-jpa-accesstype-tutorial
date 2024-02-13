package com.colak.springjpaaccesstypetutorial.repository;

import com.colak.springjpaaccesstypetutorial.jpa.FieldStudent;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldStudentRepository extends JpaRepository<FieldStudent, Integer> {
}
