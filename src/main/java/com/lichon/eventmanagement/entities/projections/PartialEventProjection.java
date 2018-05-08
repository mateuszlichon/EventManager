package com.lichon.eventmanagement.entities.projections;

import org.springframework.data.rest.core.config.Projection;

import antlr.debug.Event;

@Projection(name = "partial", types = { Event.class })
public interface PartialEventProjection {

}
