package com.xworkz.writers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="writers")
public class WriterEntity {
	
	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator = "auto")
	
	@Column(name="WID")
	private int wid;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="BEST_WORK")
	private String bestWork;
	
	@Column(name="AWARDS")
	private int awards;
	
	@Column(name="LANGUAGE")
	private String language;
	
	@Column(name="COUNTRY")
	private String country;
	

}
 