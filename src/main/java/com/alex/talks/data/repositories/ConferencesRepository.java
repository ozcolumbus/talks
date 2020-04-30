package com.alex.talks.data.repositories;

import com.alex.talks.data.entity.Conferences;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferencesRepository extends JpaRepository<Conferences,Long> {
}
