package com.corpview.Entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Director {

	@Field(name = "NAME")
	private String name;

	@Field(name = "DIN/PAN")
	private String dinPan;

	@Field(name = "DESIGNATION")
	private String designation;

	@Field(name = "BEGIN_DATE")
	private String beginDate;

	@Field(name = "END_DATE")
	private String endDate;

	@Field(name = "SURRENDERED_DIN")
	private String surrendedDin;

	private List<Association> associations;

}
