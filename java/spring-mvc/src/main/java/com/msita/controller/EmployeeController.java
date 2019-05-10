package com.msita.controller;

import com.msita.entity.CompanyEntity;
import com.msita.entity.EmployeeEntity;
import com.msita.form.EmployeeForm;
import com.msita.service.CompanyService;
import com.msita.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/createEmployee")
    public String createEmployee(final Model model) {
        model.addAttribute("employeeForm", new EmployeeForm());
        return "create_employee";
    }

    @PostMapping("/createEmployee")
    public String createEmployee(@ModelAttribute("employeeForm") final EmployeeForm employeeForm) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(employeeForm.getName());
        employeeEntity.setGender(employeeForm.getGender());
        employeeEntity.setHomeTown(employeeForm.getHomeTown());
        final int companyId = employeeForm.getCompanyId();
        //CompanyEntity companyEntity = companyService.getCompanyEntity(companyId);
        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setId(companyId);
        employeeEntity.setCompany(companyEntity);
        employeeService.createEmployee(employeeEntity);
        return "redirect:/";
    }

    @ModelAttribute("genders")
    public Map<String, String> getGenders() {
        Map<String, String> genders = new HashMap<String, String>();
        genders.put("F", "Female");
        genders.put("M", "Male");
        return genders;
    }

    @ModelAttribute("companies")
    public Map<Integer, String> getCompanies() {
        Map<Integer, String> companies = new HashMap<Integer, String>();
        List<CompanyEntity> companiesList = companyService.getAllCompanies();
        if (companiesList == null) {
            return companies;
        }

        for (int i = 0; i < companiesList.size(); ++i) {
            CompanyEntity companyEntity = companiesList.get(i);
            companies.put(companyEntity.getId(), companyEntity.getName());
        }
        return companies;
    }
}
