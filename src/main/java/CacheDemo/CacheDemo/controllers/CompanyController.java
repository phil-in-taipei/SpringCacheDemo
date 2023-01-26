package CacheDemo.CacheDemo.controllers;
import CacheDemo.CacheDemo.models.Company;
import CacheDemo.CacheDemo.models.Employee;
import CacheDemo.CacheDemo.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api2")
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @PostMapping("/companies")
    public Company addCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    @GetMapping("/companies")
    public ResponseEntity<List<Company>> getAllCompanies() {
        return ResponseEntity.ok(companyService.getAllCompanies());
    }
}
