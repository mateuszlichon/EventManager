package com.lichon.eventmanagement.entities;

import java.util.Set;

import javax.persistence.OneToMany;

public class Organizer extends AbstractEntity {

	private String name;
	
	@OneToMany(mappedBy="organizer")
	private Set<Event> events;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	
}
