package com.example.socrecard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.socrecard.model.Scorecard;
import com.example.socrecard.service.ScorecardService;

@RestController
@RequestMapping("/api")
public class ScoreCardController {

	@Autowired
	ScorecardService service;
	
	@GetMapping("/players")
	public ResponseEntity<List<Scorecard>> getAll() {
		List<Scorecard> res = service.getAll();
		return new ResponseEntity<List<Scorecard>>(res,HttpStatus.OK);
	}
	@PostMapping("/player")
	public ResponseEntity<Scorecard> saveDetails(@RequestBody Scorecard scorecard) {
		Scorecard res = service.saveDetails(scorecard);
		return new ResponseEntity<Scorecard>(res,HttpStatus.OK);
	}
}
