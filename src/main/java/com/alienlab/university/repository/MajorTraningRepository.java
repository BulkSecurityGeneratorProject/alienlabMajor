package com.alienlab.university.repository;

import com.alienlab.university.domain.MajorTraning;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the MajorTraning entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MajorTraningRepository extends JpaRepository<MajorTraning,Long> {
    
}
