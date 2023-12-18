package com.corpview.Repository;

import java.util.*;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.corpview.Entity.CompanyProfileData;
import com.corpview.Entity.CompanyProfileProjection;

@RepositoryRestResource(excerptProjection = CompanyProfileProjection.class)
public interface CompanyProfileRepository extends MongoRepository<CompanyProfileData, String> {

	List<CompanyProfileData> findByCin(String cin);

	@Aggregation(pipeline = {
			"{$match: {$or:[{'cin': {$regex: ?0, $options: 'i'}}, {'companyProfile.companyName': {$regex: ?0, $options: 'i'}}]}}",
			"{$limit: 5}" })
	List<CompanyProfileData> findByCinOrCompanyProfileCompanyName(String searchValue);

}
