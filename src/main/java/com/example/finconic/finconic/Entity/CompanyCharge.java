package com.example.finconic.finconic.Entity;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyCharge{
	
	   @Field(name="DATE_OF_MODIFICATION")
	    private String dateOfModification;

	    @Field(name="CHARGE_AMOUNT")
	    private String chargeAmount;

	    @Field(name="STATUS")
	    private String status;

	    @Field(name="ASSETS_UNDER_CHARGE")
	    private String assetsUnderCharge;

	    @Field(name="DATE_OF_CREATION")
	    private String dateOfCreation;

	    @Field(name="CHARGE_ID")
	    private String chargeId;

}
