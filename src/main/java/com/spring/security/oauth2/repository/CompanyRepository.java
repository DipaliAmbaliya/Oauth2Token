package com.spring.security.oauth2.repository;

import com.spring.security.oauth2.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
    Company findByName(String name);
//
//    Company findById(Long id);
//
//    Company findByName(String name);
//
//    List<Company> findAll();
//
//    void create(Company company);
//
//    Company update(Company company);
//
//    void delete(Long id);
//
//    void delete(Company company);
}
