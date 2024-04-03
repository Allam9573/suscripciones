package com.lukanka.app.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lukanka.app.entities.Plan;

@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {

}
