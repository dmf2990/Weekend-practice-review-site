package org.dmf.weekendprojectreviewsite.repositories;

import org.dmf.weekendprojectreviewsite.models.Gym;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//crud is a class-- gym is the object type, Long is the identifier (id) of that specific object
@Repository 
public interface GymRepository extends CrudRepository<Gym, Long> {
	
}
