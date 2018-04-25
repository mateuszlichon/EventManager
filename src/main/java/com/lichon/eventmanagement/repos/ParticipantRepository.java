package com.lichon.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.lichon.eventmanagement.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
