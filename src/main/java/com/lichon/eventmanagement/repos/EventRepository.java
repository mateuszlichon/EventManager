package com.lichon.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.lichon.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
