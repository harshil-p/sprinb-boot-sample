package com.sample.participant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.participant.json.ParticipantJson;
import com.sample.participant.service.ParticipantService;

@RestController
@RequestMapping(value = "/participant")
public class ParticipantController {

	@Autowired private ParticipantService participantService;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
    public ParticipantJson getParticipant() {
        return participantService.getParticipant();
    }
}