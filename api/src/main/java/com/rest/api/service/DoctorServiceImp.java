package com.rest.api.service;

import java.util.ArrayList;
import java.util.List;
import com.rest.api.entity.Doctor;

import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImp implements DoctorService{


    List <Doctor> list;

    public DoctorServiceImp() {
        list=new ArrayList<>();
        list.add(new Doctor(1, "Tariq Alam","MBBS", "general"));
        list.add(new Doctor(2, "Gohar Alam","MBBS", "dermatologist"));
        
    }

    @Override
    public List<Doctor> getAllDoctors() {
        
        return list;
    }

    @Override
    public Doctor getDoctorByID(long id) {
       
        Doctor doctor=null;

        for (Doctor doc:list){
            if(doc.getId()==id){
                doctor=doc;
                break;   
            }
        }
        return doctor;
    }

   
}

