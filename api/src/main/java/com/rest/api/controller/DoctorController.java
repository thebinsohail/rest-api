package com.rest.api.controller;

import com.rest.api.service.DoctorService;
import com.rest.api.entity.Doctor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
    
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public List <Doctor> getAllDoctors(){
        return this.doctorService.getAllDoctors();
    }


    @GetMapping("/doctors/{id}")
    public Doctor getDoctorById(@PathVariable String id){
        return this.doctorService.getDoctorByID(Long.parseLong(id));
    }


    
}

