package com.rest.api.service;

import java.util.List;
import com.rest.api.entity.Patient;

public interface PatientService {
    public List <Patient> getAllPatient();    
    public Patient getPatientById(long id);    
    public void savePatient(Patient patient);
    public void removePatient(long id);    
}
