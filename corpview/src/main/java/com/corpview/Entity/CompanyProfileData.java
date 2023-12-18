package com.corpview.Entity;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "FIN_COMPANY_PROFILE")
public class CompanyProfileData {

	@Id
	private String id;

	@Field(name = "_CIN")
	private String cin;

	private List<String> dins;

	private List<CompanyCharge> companyCharges;

	private List<Director> directors;

	private CompanyProfile companyProfile;
	
	

}
