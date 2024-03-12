package com.api.VacControl.controllers;

import com.api.VacControl.models.EmployeeModel;
import com.api.VacControl.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/vacciness")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ArrayList<EmployeeModel> getEmployees(){
        return this.employeeService.getEmployees();
    }

    @PostMapping("/newEmployee")
    public EmployeeModel saveEmployee(@RequestBody EmployeeModel employee){
        return this.employeeService.saveEmployee(employee);
    }

    @PutMapping(path = "/employee/{id}")
    public EmployeeModel updateEmployeeById(@RequestBody EmployeeModel request, @PathVariable Long id){
        return this.employeeService.updateById(request, id);
    }

    @DeleteMapping(path = "/employee/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.employeeService.deleteEmployee(id);

        if (ok){
            return "Empleado eliminado correctamente";
        }else {
            return "El empleado no se pudo eliminar o no existe";
        }
    }
}
