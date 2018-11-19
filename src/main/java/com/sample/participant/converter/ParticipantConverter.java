package com.sample.participant.converter;

import com.sample.participant.entity.Participant;
import com.sample.participant.json.ParticipantJson;
import com.sample.util.CommonUtil;

public class ParticipantConverter {

	public static ParticipantJson convert(Participant user) {
		ParticipantJson participantJson = new ParticipantJson();
		participantJson.setName(user.getName());
		participantJson.setEmail(user.getEmail());
		participantJson.setLastAccessDate(CommonUtil.getFormattedDate());
		return participantJson;
	}
}
