package com.corpview.Entity;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyProfile{
	
	    @Field(name = "DATE_OF_INCORPORATION")
	    private String dateOfIncorporation;

	    @Field(name = "ADDRESS_OTHER_THAN_R/O_WHERE_ALL_OR_ANY_BOOKS_OF_ACCOUNT_AND_PAPERS_ARE_MAINTAINED") 
	    private String companyAddress; // change Big name to small Name

	    @Field(name = "DATE_OF_BALANCE_SHEET")
	    private String dateOfBalanceSheet;

	    @Field(name = "REGISTRATION_NUMBER")
	    private String registrationNumber;

	    @Field(name = "CIN_")
	    private String cin;

	    @Field(name = "CLASS_OF_COMPANY")
	    private String classOfCompany;

	    @Field(name = "REGISTERED_ADDRESS")
	    private String registeredAddress;

	    @Field(name = "COMPANY_CATEGORY")
	    private String companyCategory;

	    @Field(name = "SUSPENDED_AT_STOCK_EXCHANGE")
	    private String suspendedAtStockExchange;

	    @Field(name = "COMPANY_NAME")
	    private String companyName;

	    @Field(name = "ACTIVE_COMPLIANCE")
	    private String activeCompliance;

	    @Field(name = "DATE_OF_LAST_AGM")
	    private String dateOfLastAgm;

	    @Field(name = "EMAIL_ID")
	    private String emailId;

	    @Field(name = "WHETHER_LISTED_OR_NOT")
	    private String whetherListedOrNot;

	    @Field(name = "ROC_CODE")
	    private String rocCode;

	    @Field(name = "COMPANY_SUBCATEGORY")
	    private String companySubcategory;

	    @Field(name = "PAID_UP_CAPITAL")
	    private String paidUpCapital;

	    @Field(name = "AUTHORISED_CAPITAL")
	    private String authorisedCapital;

	    @Field(name = "COMPANY_STATUS")
	    private String companyStatus;

	    @Field(name = "NUMBER_OF_MEMBERS")
	    private String numberOfMembers;


}
