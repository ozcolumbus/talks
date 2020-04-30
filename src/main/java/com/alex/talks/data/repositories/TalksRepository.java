package com.alex.talks.data.repositories;

import com.alex.talks.data.entity.TalkTypes;
import com.alex.talks.data.entity.Talks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TalksRepository extends JpaRepository<Talks,Long> {
List<Talks> findAllById(Long id);
}
