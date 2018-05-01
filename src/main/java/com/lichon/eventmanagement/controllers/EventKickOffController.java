package com.lichon.eventmanagement.controllers;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {

	@PostMapping("/start/{id}")
	public ResponseEntity start(@PathVariable Long id) {
		return null;
	}
}
