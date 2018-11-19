package com.sample.exception.json;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class FaultResponseJson {

	private Integer errorCode;
	private String errorMessage;
}
