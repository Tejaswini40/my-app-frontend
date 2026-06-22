package com.codinghub.Repository;

import java.util.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.codinghub.Entity.Institute;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, Long> {

    // Single-field finders
    Optional<Institute> findByName(String name);
    Optional<Institute> findByLocation(String location);
    Optional<Institute> findByFee(Double fee);
    Optional<Institute> findByFaculty(String faculty);

    // AND  ← "total" maps to the fee field in entity
    List<Institute> findByNameAndFee(String name, Double fee);

    // OR
    List<Institute> findByNameOrId(String name, Long id);
    // Between (id range)
    List<Institute> findByIdBetween(Long start, Long end);

    // Greater than
    List<Institute> findByIdGreaterThan(Long num);

    // Less than
    List<Institute> findByIdLessThan(Long id);

    // LIKE (use Containing — Spring adds % wildcards automatically)
    List<Institute> findByNameContaining(String name);

    // Custom native SQL query  ← FIX: "Select*" needs a space: "SELECT * FROM"
    @Query(value = "SELECT * FROM institute", nativeQuery = true)
    List<Institute> customQuery();

}