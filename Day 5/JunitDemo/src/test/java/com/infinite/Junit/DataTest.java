package com.infinite.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	@Test
	public void testEvenOdd(){
		Data obj=new Data();
		assertTrue(obj.evenOdd(6));
		assertFalse(obj.evenOdd(5));
	}
	@Test
	public void testArray(){
		int[]a= new int[]{1,2,3,4};
		int[]b= new int[]{1,2,3,4};
		assertArrayEquals(a,b);
		
	}

	@Test 
	public void testsayHello(){
		Data obj=new Data();
		assertEquals("Welcome to Junit..",obj.sayHello());
	}
@Test
public void testSum(){
	Data obj=new Data();
	assertEquals(5,obj.sum(2, 3));
}
@Test
public void testMax3(){
	Data obj=new Data();
	assertEquals(5,obj.max3(5,2, 3));
	assertEquals(5,obj.max3(2,5, 3));
	assertEquals(5,obj.max3(2,3, 5));
}
}