package com.learn.service.entities;

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
@ToString
@Builder

public class Rating {
	
	private String ratingId;
	private String empId;
	private String cmpId;
	private String feedback;
	private int rating;
}
