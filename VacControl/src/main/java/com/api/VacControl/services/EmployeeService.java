package com.api.VacControl.services;

import com.api.VacControl.models.EmployeeModel;
import com.api.VacControl.repositories.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepository employeeRepository;

    public ArrayList<EmployeeModel> getEmployees(){
        return (ArrayList<EmployeeModel>) employeeRepository.findAll();
    }

    public EmployeeModel saveEmployee(EmployeeModel employee) {
        return employeeRepository.save(employee);
    }

    public EmployeeModel updateById(EmployeeModel request, Long id) {
        EmployeeModel employee = employeeRepository.findById(id).orElse(null);

        if (employee != null) {
            employee.setFirstname(request.getFirstname());
            employee.setLastname(request.getLastname());
            employee.setAge(request.getAge());
            employee.setPosition(request.getPosition());
            return employeeRepository.save(employee);
        } else {
            return null;
        }
    }

    public Boolean deleteEmployee (Long id){
        try {
            employeeRepository.deleteById(id);
            return true;
        }catch ( Exception ex){
            return false;
        }
    }

}
