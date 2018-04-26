package com.lichon.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lichon.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
