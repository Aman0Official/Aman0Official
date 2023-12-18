package com.corpview.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corpview.CorpviewService.CompanyProfileService;
import com.corpview.Dto.CompanyDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RestController
public class CompanyProfileController {

	
	private final CompanyProfileService companyProfileService;

	public CompanyProfileController(CompanyProfileService companyProfileService) {
		this.companyProfileService = companyProfileService;
	}

	@PostMapping("cinOrcompanyName")
	public List<CompanyDetailsDTO> getCompanyDetails(@RequestParam String searchValue) {
		return companyProfileService.getCompanyDetails(searchValue);

	}

}
