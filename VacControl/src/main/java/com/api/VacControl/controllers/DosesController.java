package com.api.VacControl.controllers;


import com.api.VacControl.models.DosesModel;
import com.api.VacControl.services.DosesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/doses")
public class DosesController {

    @Autowired
    private DosesService dosesService;

    @GetMapping("/allDoses")
    public ArrayList<DosesModel> getDoses(){
        return this.dosesService.getDoses();
    }

    @PostMapping("/newDose")
    public DosesModel dosesModel(@RequestBody DosesModel dose){
        return this.dosesService.saveDose(dose);
    }


    @PutMapping(path = "/dose/{id}")
    public DosesModel updateDosesById(@RequestBody DosesModel request, @PathVariable Long id){
        return this.dosesService.updateById(request, id);
    }

    @DeleteMapping(path = "/dose/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.dosesService.deleteDose(id);

        if (ok) {
            return "Registro de vacunacion eliminado correctamente";
        } else {
            return "El registro no pudo ser eliminar o no existe";
        }
    }
}
