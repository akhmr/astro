package com.astro.common.constant;

public enum StatusCode {

	SUCCESS("000", "Api Success"),
	ERROR("500", "Internal server error"),
	NOT_FOUND("300", "Resource not found"),
	UNAUTHORIZED("400", "Unauthorized access");

	StatusCode(String code, String message) {

		this.code = code;
		this.message = message;
	}

	private String code;
	private String message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
