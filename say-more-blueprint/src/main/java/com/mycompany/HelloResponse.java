package com.mycompany;

public class HelloResponse {
	public String response;
	public String[] errors;
	
	public HelloResponse() {
		// empty
	}
	
	public HelloResponse(String response) {
		this.response = response;
		this.errors = null;
	}

	public HelloResponse(String response, String[] errors) {
		this.response = response;
		this.errors = errors;
	}
}
