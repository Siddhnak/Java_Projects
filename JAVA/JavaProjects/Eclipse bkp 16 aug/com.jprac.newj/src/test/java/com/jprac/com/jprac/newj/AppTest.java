package com.jprac.com.jprac.newj;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */

import static org.junit.jupiter.api.Assertions.fail;

public class AppTest {
    @Test
    void test() {
//        System.out.println("This test ran");
//    fail("Not yet implemented");
    	App app = new App();
    	int expected = 3;
    	int actual = app.add(1, 1);
    	assertEquals(expected, actual,"The add method should add two numbers");
    	
    	//This is what we are trying to
    	//say here...expected = actual..
    	
    	
    }
}
