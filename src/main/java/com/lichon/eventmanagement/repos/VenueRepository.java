package com.lichon.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lichon.eventmanagement.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
