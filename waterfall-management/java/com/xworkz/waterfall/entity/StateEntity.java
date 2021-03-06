package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="states")
public class StateEntity {
	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	
	@Column(name="SID")
	private int sid;
	@Column(name="NAME")
	private String name;
	@Column(name="LANGUAGE")
	private String language;
	@Column(name="POPULATION")
	private double population;
	@Column(name="NO_OF_DISTRICTS")
	private int noOfDistricts;

}
