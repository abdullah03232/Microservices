package com.learn.service.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	private String empId;
	private String empName;
	private String empEmail;
	private String empDesignation;
	private String empContact;
	private String empAddress;
	@Transient
	private List<Rating> rating = new ArrayList<Rating>();
}
