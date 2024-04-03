package com.lukanka.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.app.entities.Plan;
import com.lukanka.app.respositories.PlanRepository;
import com.lukanka.app.services.PlanService;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;

    @Override
    public Plan crearPlan(Plan plan) {
        return this.planRepository.save(plan);
    }

    @Override
    public List<Plan> listarPlanes() {
        return (List<Plan>) this.planRepository.findAll();
    }

}
