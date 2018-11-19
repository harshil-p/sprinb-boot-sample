package com.sample.participant.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sample.exception.json.FaultResponseJson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@JsonInclude(value = Include.NON_NULL)
public class ParticipantJson extends FaultResponseJson{

	private String name;
	private String email;
	private String lastAccessDate;
}
