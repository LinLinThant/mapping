package com.jdc.mapping.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity
public class Classes implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate startDate;
	private LocalTime startTime;
	private LocalTime endTime;
	private double months;
	private int fees;
	
	@Enumerated(EnumType.STRING)
	private Days days;
	
	@ManyToOne
	private Course course;
	
	@OneToMany
	private List<Teacher> teachers; 
	
	@ManyToOne
	private Teacher head;
	
	private enum Days{
		MON, TUE, WED, THU, FRI, SAT, SUN
	}
}
