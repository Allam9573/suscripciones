package com.lukanka.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.app.entities.Plan;
import com.lukanka.app.services.impl.PlanServiceImpl;

@RestController
@RequestMapping("/api/planes")
public class PlanController {

    @Autowired
    private PlanServiceImpl planServiceImpl;

    @GetMapping({ "", "/" })
    public List<Plan> listarPlanes() {
        return this.planServiceImpl.listarPlanes();
    }

    @PostMapping("/crear")
    public Plan crearPlan(@RequestBody Plan plan) {
        return this.planServiceImpl.crearPlan(plan);
    }

}
