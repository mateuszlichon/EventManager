package com.lichon.eventmanagement.entities.projections;

import java.time.ZonedDateTime;

import org.springframework.data.rest.core.config.Projection;

import antlr.debug.Event;

@Projection(name = "partial", types = { Event.class })
public interface PartialEventProjection {

	String getName();

	ZonedDateTime getStartTime();

	ZonedDateTime getEndTime();
}
