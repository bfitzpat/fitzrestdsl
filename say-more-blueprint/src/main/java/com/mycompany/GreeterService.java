package com.mycompany;

public class GreeterService {

	public HelloResponse createHello(HelloRequest request) throws Exception {
		return new HelloResponse("SUCCESS", new String[] { "warn1", "warn2" });
	}
}
