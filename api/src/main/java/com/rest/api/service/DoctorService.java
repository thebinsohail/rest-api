package com.rest.api.service;
import java.util.List;

import com.rest.api.entity.Doctor;


public interface DoctorService {
   public List <Doctor >getAllDoctors();  
   public Doctor getDoctorByID(long id);  
  
      
}

