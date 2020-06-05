package com.example.socrecard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.socrecard.model.Scorecard;
import com.example.socrecard.repository.ScorecardRepository;

import net.bytebuddy.asm.Advice.Return;

@Service
public class ScorecardService {
	@Autowired
	ScorecardRepository repository;

	public List<Scorecard> getAll(){
		return repository.findAll();
	}

	public Scorecard saveDetails(Scorecard scorecard) {
            return  repository.save(scorecard);
	}
}
