package com.msita.controller;

import com.msita.entity.CompanyEntity;
import com.msita.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/createCompany")
    public String createCompany() {
        return "create_company";
    }

    @PostMapping("/createCompany")
    public String createCompany(@RequestParam("companyName") final String companyName) {
        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setName(companyName);
        companyService.createCompany(companyEntity);
        return "redirect:/";
    }

}
