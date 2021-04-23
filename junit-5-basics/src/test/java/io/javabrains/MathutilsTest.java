package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

@DisplayName("Class Math utils")
class MathutilsTest {
	
	Mathutils mathutils;
	
	@BeforeAll
	static void cleanBeforeAll()
	{
		System.out.println("Cleaning !!!!!!!!!");
	}
	
	@BeforeEach
	public void init()
	{
		mathutils = new Mathutils();
	}
	
	@AfterEach
	void clean()
	{
		System.out.println("Cleaning !!!!!!!!!");
	}
	
	@Nested
	@DisplayName("Class Add numbers")
	class Addnumbers{

	@Test
	@DisplayName("This is ADD method.")
	void testAddPositive() {
	
		assertEquals(2, mathutils.add(1, 1),"Add mothod have two numbers for positive");
		//System.out.println("Needs to implemenetd");
	}
	
	@Test
	@DisplayName("This is ADD method for negative")
	void testAddNegaive() {
		
		assertEquals(2, mathutils.add(3, -1),"Add mothod have two numbers for negative");
		//System.out.println("Needs to implemenetd");
	}
	}
	
	@Test
	public void testDivide()
	{
		assertThrows(ArithmeticException.class,() -> mathutils.divide(1, 0),"Divide by zero should not possible");
		
	}
	
	@RepeatedTest(3)
	void testComputeCirceArea()
	{
		assertEquals(314.1592653589793,mathutils.computeCircleArea(10),"Sjould return Area of the circle");
	}
	
	@Test
	@DisplayName("Method for TDD")
	@Disabled
	void TDDTest()
	{
		System.out.println("Testing the disabled");
		
	}
	
	@Test
	@DisplayName("This is Multiply method.")
	void testMultiply() {
		assertAll(
				() -> assertEquals(9,mathutils.multiply(3,3)),
				() -> assertEquals(0,mathutils.multiply(3,0)),
				() -> assertEquals(-9,mathutils.multiply(3,-3))
				);
				
		//System.out.println("Needs to implemenetd");
	}

}
