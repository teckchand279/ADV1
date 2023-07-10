package com.app.dto;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.app.entities.Catagory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class RequestDTO {
	@NotBlank
	private String name;
	@Column(name="catg")
	private Catagory ctgr;
	@Column(name="Start_Tm")
	private LocalDateTime strtTm;
	@Column(name="End_Tm")
	private LocalDateTime endTm;
	@Min(value=1)
	private int distance;
	@Min(value=1)
	private int freq;
}
