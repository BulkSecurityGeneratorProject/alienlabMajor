package com.alienlab.university.service;

import com.alienlab.university.domain.BaseCourse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing BaseCourse.
 */
public interface BaseCourseService {

    /**
     * Save a baseCourse.
     *
     * @param baseCourse the entity to save
     * @return the persisted entity
     */
    BaseCourse save(BaseCourse baseCourse);

    /**
     *  Get all the baseCourses.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<BaseCourse> findAll(Pageable pageable);

    /**
     *  Get the "id" baseCourse.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    BaseCourse findOne(Long id);

    /**
     *  Delete the "id" baseCourse.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
