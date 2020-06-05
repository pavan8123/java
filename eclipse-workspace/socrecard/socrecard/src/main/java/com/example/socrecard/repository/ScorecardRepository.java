package com.example.socrecard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.socrecard.model.Scorecard;

public interface ScorecardRepository extends JpaRepository<Scorecard, Integer> {

}
