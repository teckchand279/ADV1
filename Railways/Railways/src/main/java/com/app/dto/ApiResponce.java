package com.app.dto;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class ApiResponce {
private String msg;
private LocalDateTime timeStamp;
public ApiResponce(String msg) {
	super();
	this.msg = msg;
	this.timeStamp=LocalDateTime.now();
}

}
