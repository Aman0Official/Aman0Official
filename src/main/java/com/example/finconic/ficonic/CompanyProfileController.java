package com.example.finconic.ficonic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.finconic.ficonic.Repository.CompanyProfileRepository;
import com.example.finconic.finconic.Entity.CompanyDetailsDTO;
import com.example.finconic.finconic.Entity.CompanyProfile;
import com.example.finconic.finconic.Entity.CompanyProfileData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CompanyProfileController {

	@Autowired
    private  CompanyProfileRepository companyProfileRepository;

    @GetMapping("companyDetails")
    public List<CompanyDetailsDTO> getCompanyDetails(@RequestParam String searchValue) {
        return companyProfileRepository.findByCinOrCompanyProfileCompanyName(searchValue)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private CompanyDetailsDTO convertToDTO(CompanyProfileData profileData) {
        CompanyDetailsDTO dto = new CompanyDetailsDTO();
        dto.setCompanyName(profileData.getCompanyProfile().getCompanyName());
        dto.setCompanyStatus(profileData.getCompanyProfile().getCompanyStatus());
        dto.setRocCode(profileData.getCompanyProfile().getRocCode());
        dto.setCin(profileData.getCin());
        return dto;
    }
	
	
}
