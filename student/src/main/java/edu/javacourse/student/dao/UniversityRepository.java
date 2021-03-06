package edu.javacourse.student.dao;

import edu.javacourse.student.domain.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UniversityRepository extends JpaRepository<University, Long> {

    @Query(name = "Universuty.findAllWithFaculties",
            value = "SELECT u FROM University u LEFT JOIN FETCH u.faculties ")
    List<University> findFullList();

}
