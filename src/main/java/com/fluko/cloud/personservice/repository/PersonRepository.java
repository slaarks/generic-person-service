package com.fluko.cloud.personservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fluko.cloud.personservice.entity.PersonEntity;


@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {}

