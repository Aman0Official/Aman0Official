package com.example.finconic.finconic.Entity;

import java.util.*;

public interface CompanyProfileProjection {

	String getCin();

	List<String> getDins();

	List<CompanyCharge> getCompanyCharges();

	List<Director> getDirectors();

	CompanyProfile getCompanyProfile();

}
