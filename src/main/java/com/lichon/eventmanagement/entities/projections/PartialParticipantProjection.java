package com.lichon.eventmanagement.entities.projections;

import org.springframework.data.rest.core.config.Projection;

import com.lichon.eventmanagement.entities.Participant;

@Projection(name = "name", types = { Participant.class })
public interface PartialParticipantProjection {

	String getName();

	Boolean getCheckedIn();
}
