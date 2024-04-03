package com.lukanka.app.services;

import java.util.List;

import com.lukanka.app.entities.Plan;

public interface PlanService {

    public Plan crearPlan(Plan plan);

    public List<Plan> listarPlanes();

}
