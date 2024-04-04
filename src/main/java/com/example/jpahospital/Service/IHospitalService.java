package com.example.jpahospital.Service;


import com.example.jpahospital.entities.Consultation;
import com.example.jpahospital.entities.Medecin;
import com.example.jpahospital.entities.Patient;
import com.example.jpahospital.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}