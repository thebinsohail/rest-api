package com.rest.api.controller;

import com.rest.api.service.PatientService;

import java.util.List;

import com.rest.api.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class PatientController {
   
    @Autowired
    private PatientService patientService;
    
    @GetMapping("/patients")
    public List <Patient> getAllDoctors(){
       return this.patientService.getAllPatient();
    }

    @GetMapping("/patients/{id}")
    public Patient getPatientById(@PathVariable String id){
      return this.patientService.getPatientById(Long.parseLong(id));
    }

    @PostMapping(value="/patients/new")
    public void addPatient(@RequestBody Patient patient){
       
       this.patientService.savePatient(patient);

    }
    
  @RequestMapping(value = "/patients/delete/{id}",method = RequestMethod.DELETE)
  public void deletePatient(@PathVariable String id){
       
    this.patientService.removePatient(Long.parseLong(id));

 }

}
