package com.project.zuma.parameters.repositories;

import com.project.zuma.parameters.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location,Integer> {
}
