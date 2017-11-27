package com.mycompany;

public class GreeterService {

	public HelloResponse createHello(HelloRequest request) throws Exception {
		if (request == null) {
			return new HelloResponse("FAILURE", new String[] {"HelloRequest was null"});
		} else if (request.name == null || request.name.isEmpty()) {
			return new HelloResponse("FAILURE", new String[] {"HelloRequest.name was empty"});
		}
		return new HelloResponse("SUCCESS:" + request.name);
	}
}
