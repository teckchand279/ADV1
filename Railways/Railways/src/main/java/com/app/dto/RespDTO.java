package com.app.dto;

import java.time.LocalDateTime;



import com.app.entities.Catagory;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class RespDTO {
	private String name;
	private Catagory ctgr;
	private LocalDateTime strtTm;
	private LocalDateTime endTm;
	private int distance;
	private int freq;
}
