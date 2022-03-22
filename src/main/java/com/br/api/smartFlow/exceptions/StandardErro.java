package com.br.api.smartFlow.exceptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardErro implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer status;
	private String message;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy    HH:MM")
	private Long timesStamp;
 	
	public StandardErro() {
		// TODO Auto-generated constructor stub
	}

	public StandardErro(Integer status, String message, Long timesStamp) {
		super();
		this.status = status;
		this.message = message;
		this.timesStamp = timesStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getTimesStamp() {
		return timesStamp;
	}

	public void setTimesStamp(Long timesStamp) {
		this.timesStamp = timesStamp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
