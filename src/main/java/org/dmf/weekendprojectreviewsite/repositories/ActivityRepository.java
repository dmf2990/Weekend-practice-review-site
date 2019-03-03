package org.dmf.weekendprojectreviewsite.repositories;

import org.dmf.weekendprojectreviewsite.models.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends CrudRepository<Activity, Long> {

}
