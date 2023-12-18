package com.corpview.CorpviewService;
import java.util.*;

import com.corpview.Dto.CompanyDetailsDTO;

public interface CompanyProfileService {
	
	List<CompanyDetailsDTO> getCompanyDetails(String searchValue);

}
