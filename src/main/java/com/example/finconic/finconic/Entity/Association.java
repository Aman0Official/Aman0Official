package com.example.finconic.finconic.Entity;


import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Association{

	@Field(name = "BEGIN_DATE")
    private String beginDate;

	@Field(name = "END_DATE")
    private String endDate;

	@Field(name = "CIN")
    private String cin;

	@Field(name="ACTIVE_EMPLOYMENT")
	private String activeEmployment;
	
	@Field(name="COMPANY_NAME")
	private String companyName;
	

}
