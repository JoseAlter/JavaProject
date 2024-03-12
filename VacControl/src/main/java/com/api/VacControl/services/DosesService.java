package com.api.VacControl.services;

import com.api.VacControl.models.DosesModel;
import com.api.VacControl.repositories.IDosesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DosesService {

    @Autowired
    IDosesRepository dosesRepository;

    public ArrayList<DosesModel> getDoses(){
        return (ArrayList<DosesModel>) dosesRepository.findAll();
    }

    public DosesModel saveDose(DosesModel dose) {
        return dosesRepository.save(dose);
    }

    public DosesModel updateById(DosesModel request, Long id) {
        DosesModel doses = dosesRepository.findById(id).orElse(null);

        if (doses != null) {
            doses.setEmployee_Id(request.getEmployee_Id());
            doses.setVaccine_Id (request.getVaccine_Id());
            doses.setDose_number(request.getDose_number());
            doses.setFirst_dose(request.getFirst_dose());

            return dosesRepository.save(doses);
        } else {
            return null;
        }
    }

    public Boolean deleteDose (Long id){
        try {
            dosesRepository.deleteById(id);
            return true;
        }catch ( Exception ex){
            return false;
        }
    }
}
