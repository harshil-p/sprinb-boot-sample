package com.sample.participant.service.impl;

import org.springframework.stereotype.Service;

import com.sample.participant.converter.ParticipantConverter;
import com.sample.participant.entity.Participant;
import com.sample.participant.json.ParticipantJson;
import com.sample.participant.service.ParticipantService;

@Service
public class ParticipantServiceImpl implements ParticipantService{
	
	//Below line must be uncommented when ready to get data from database
	//@Autowired private ParticipantRepository participantRepository;
	
	@Override
	public ParticipantJson getParticipant() {
		
		try {
			//Below line must be uncommented when ready to get data from database
			//return participantRepository.findByName(username);
			
			//Below line must be deleted when ready to get data from database
			Participant sampleParticipant = new Participant(1, "John Smith", "jsmith@hello.com");
			
			return ParticipantConverter.convert(sampleParticipant);
		}catch (Exception e) {
			ParticipantJson userJson = new ParticipantJson();
			userJson.setErrorCode(1000);
			userJson.setErrorMessage("Participant not found");
			return userJson;
		}
	}	
}
