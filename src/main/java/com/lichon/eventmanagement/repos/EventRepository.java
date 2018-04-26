package com.lichon.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lichon.eventmanagement.entities.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

}
