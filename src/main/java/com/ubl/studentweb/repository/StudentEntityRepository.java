package com.ubl.studentweb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentEntityRepository extends JpaRepository<StudentEntity, Long> {

    Optional<StudentEntity> findByNim(final String nim);

}