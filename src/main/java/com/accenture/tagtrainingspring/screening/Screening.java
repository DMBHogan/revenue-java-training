package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;

public class Screening{

    private Integer ScreeningId;

    private Patient patient;

    private LocalDate DateOfScreening;

    private boolean MalignantResult;

    public Screening(Integer screeningId, Patient patient, LocalDate dateOfScreening, boolean malignantResult) {
        ScreeningId = screeningId;
        this.patient = patient;
        DateOfScreening = dateOfScreening;
        MalignantResult = malignantResult;
    }

    public Integer getScreeningId() {
        return ScreeningId;
    }

    public void setScreeningId(Integer screeningId) {
        ScreeningId = screeningId;
    }

    public Patient getPatient(){ return patient;}


    public LocalDate getDateOfScreening() {
        return DateOfScreening;
    }

    public void setDateOfScreening(LocalDate dateOfScreening) {
        DateOfScreening = dateOfScreening;
    }

    public boolean isMalignantResult() {
        return MalignantResult;
    }

    public void setMalignantResult(boolean malignantResult) {
        MalignantResult = malignantResult;
    }



}
