package com.sample.participant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "participant")
public class Participant {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name = "name")
	private String name;
    
	@Column(name = "email")
	private String email;
	
}
