package com.example.finconic.ficonic.Repository;

import java.util.*;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.finconic.finconic.Entity.CompanyProfile;
import com.example.finconic.finconic.Entity.CompanyProfileData;
import com.example.finconic.finconic.Entity.CompanyProfileProjection;

@RepositoryRestResource(excerptProjection = CompanyProfileProjection.class)
public interface CompanyProfileRepository extends MongoRepository<CompanyProfileData, String>{
	
	List<CompanyProfileData> findByCin(String cin);
	

	//@Query("{$or:[{'cin': {$regex: ?0, $options: 'i'}}, {'companyProfile.companyName': {$regex: ?0, $options: 'i'}}]}")
	@Aggregation(pipeline = {
            "{$match: {$or:[{'cin': {$regex: ?0, $options: 'i'}}, {'companyProfile.companyName': {$regex: ?0, $options: 'i'}}]}}",
            "{$limit: 5}"
    })
	List<CompanyProfileData> findByCinOrCompanyProfileCompanyName(String searchValue);
	
	
	
	
}
