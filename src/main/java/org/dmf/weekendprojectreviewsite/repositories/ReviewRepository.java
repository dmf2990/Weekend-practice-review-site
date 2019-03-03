package org.dmf.weekendprojectreviewsite.repositories;

import org.dmf.weekendprojectreviewsite.models.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

}
