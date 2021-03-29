package com.rest.api.service;

import java.util.ArrayList;
import java.util.List;
import com.rest.api.entity.Patient;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImp implements PatientService {


    List<Patient> list;

    public PatientServiceImp() {
        list = new ArrayList<>();
    }

    @Override
    public List<Patient> getAllPatient() {

        return list;
    }

    @Override
    public Patient getPatientById(long id) {

        Patient patient = null;

        for (Patient p : list) {
            if (p.getId() == id) {
                patient = p;
                break;
            }
        }

        return patient;
    }

    @Override
    public void savePatient(Patient patient) {

        patient.setId(patient.getId()+1);
        list.add(new Patient(patient.getId(), patient.getName(), patient.getAddress()));

    }

    @Override
    public void removePatient(long id) {
        Patient patient = null;

         for (Patient p : list) {
            if (p.getId() == id) {
                patient = p;
                list.remove(patient);
                break;
            }
        }
    }
}
