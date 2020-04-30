package com.alex.talks.data.repositories;

import com.alex.talks.data.entity.TalkTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TalkTypesRepository extends JpaRepository<TalkTypes,Long> {
 TalkTypes findAllById(Long id);



}
