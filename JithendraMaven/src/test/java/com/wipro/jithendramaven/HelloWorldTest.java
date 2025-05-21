package com.wipro.jithendramaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {
	 @Test
	 public void testAdd() {
	        HelloWorld app = new HelloWorld();
	        int result = app.add(3, 4);
	        assertEquals(7, result);
	    }
}
