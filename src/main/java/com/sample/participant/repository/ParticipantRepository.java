package com.sample.participant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.participant.entity.Participant;

@Repository
public interface ParticipantRepository extends CrudRepository<Participant, Integer>{

	Participant findByName(String name);
}
