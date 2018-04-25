package com.lichon.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.lichon.eventmanagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
