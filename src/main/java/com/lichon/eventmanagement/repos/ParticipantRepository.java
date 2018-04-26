package com.lichon.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lichon.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
