package com.destro.common;

public class Response<T> extends Base{
	
	private T data;
	
	public Response(String code, String message ,T data) {
		super(code,message);
		this.data=data;
	}
	
	public Response(String code, String message) {
		super(code,message);
	}

	public T getData() {
		return data;
	}
	

}
