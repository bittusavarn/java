package com.soap;

import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "com.soap.SoapTest")
public class SoapTestImpl implements SoapTest{
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World Jax-Ws" + name;
	}
 
}