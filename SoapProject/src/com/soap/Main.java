package com.soap;

import javax.xml.ws.Endpoint;
/**
 * 
 * @author Nilamber Kumar
 *
 */
public class Main {
	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9999/ws/hello", new SoapTestImpl());
	    }
	 
}
