package com.lichon.eventmanagement.controllers;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lichon.eventmanagement.entities.Participant;

@RepositoryRestController
@RequestMapping("/events")
public class CheckInController {

	@PostMapping("/checkin/{id}")
	public ResponseEntity<Participant> checkIn(@PathVariable Long id) {
		return null;
	}
}
