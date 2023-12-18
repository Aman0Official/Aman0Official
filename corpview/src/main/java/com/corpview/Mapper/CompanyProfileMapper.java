package com.corpview.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.corpview.Dto.CompanyDetailsDTO;
import com.corpview.Entity.CompanyProfileData;

@Mapper
public interface CompanyProfileMapper {

	CompanyProfileMapper INSTANCE = Mappers.getMapper(CompanyProfileMapper.class);

	@Mapping(source = "companyProfile.companyName", target = "companyName", defaultValue = "NULL")
	@Mapping(source = "companyProfile.companyStatus", target = "companyStatus", defaultValue = "NULL")
	@Mapping(source = "companyProfile.rocCode", target = "rocCode", defaultValue = "NULL")
	@Mapping(source = "cin", target = "cin", defaultValue = "NULL")
	CompanyDetailsDTO limitedDto(CompanyProfileData companyProfileData);

}
