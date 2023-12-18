package com.corpview.CorpviewServiceImpl;

import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corpview.CorpviewService.CompanyProfileService;
import com.corpview.Dto.CompanyDetailsDTO;
import com.corpview.Mapper.CompanyProfileMapper;
import com.corpview.Repository.CompanyProfileRepository;

@Service
public class CompanyProfileServiceImpl implements CompanyProfileService {

	private static final Logger log = LoggerFactory.getLogger(CompanyProfileServiceImpl.class);

//     @Autowired
//	 private  CompanyProfileRepository companyProfileRepository;

	private final CompanyProfileRepository companyProfileRepository;

	public CompanyProfileServiceImpl(CompanyProfileRepository companyProfileRepository) {
		this.companyProfileRepository = companyProfileRepository;
	}

	@Override
	public List<CompanyDetailsDTO> getCompanyDetails(String searchValue) {
		log.info(searchValue);
		return companyProfileRepository.findByCinOrCompanyProfileCompanyName(searchValue).stream()
				.map(CompanyProfileMapper.INSTANCE::limitedDto).collect(Collectors.toList());
	}
}
