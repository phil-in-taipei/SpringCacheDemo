package CacheDemo.CacheDemo.services;
import CacheDemo.CacheDemo.exceptions.ResourceNotFoundException;

import CacheDemo.CacheDemo.models.Company;
//import CacheDemo.CacheDemo.models.Employee;
import CacheDemo.CacheDemo.models.Employee;
import CacheDemo.CacheDemo.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    @Cacheable(value = "companies")
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @CachePut(value = "companies", key = "#company.id")
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }
}
