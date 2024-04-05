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

    @Override
    public Plan buscarPlan(int id) {
        return this.planRepository.findById(id).get();
    }

    @Override
    public Plan actualizarPlan(int id, Plan plan) {
        Plan actualizarPlan = this.planRepository.findById(id).get();
        if (actualizarPlan != null) {
            actualizarPlan.setDescripcion(plan.getDescripcion());
            actualizarPlan.setTipoStreaming(plan.getTipoStreaming());
            this.planRepository.save(actualizarPlan);
        }
        return actualizarPlan;
    }

}
