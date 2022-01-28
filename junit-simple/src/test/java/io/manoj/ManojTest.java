package io.manoj;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;


@DisplayName("when running manojTest")
class ManojTest {

	Manoj m;
	TestInfo testInfo;
	 TestReporter testReporter;

	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter=testReporter;
		
		m=new Manoj();

		testReporter.publishEntry("Running+"+testInfo.getDisplayName()+" +with tags+ "+testInfo.getTags());
	
	}
	
	
	@Test
	@DisplayName("Testing add method")
	void testAdd() {
		
	
		int expected =2 ;
	
		int actual = m.add(1, 1);
		assertEquals( expected,actual,"The add method should add two numbers ");
		
	}
	@Test
	void testDividen() {
	
	assertThrows(ArithmeticException.class, () ->	m.divide(1, 0), "Divide by zero should throw");
	
	}
	
	@Test
	void testMultiply() {
		assertEquals(4,m.multiply(2, 2),"should return the right product");
		
	}
	@Test
	void computerCircleArea() {

		assertEquals(314.1592653589793,m.computerCircleArea(10),"should retuen right circle area");
	}

	@Test
	@Disabled
	void testDisabled() {
		fail("this test should be disabled");
	}
	@Nested
	@DisplayName("add method")
	@Tag("Math")
class adTest{
	@Test
	@DisplayName("when adding two positive numbers ")
	void testaddpositive() {
		assertEquals(-2,m.add(-1, -1),"return the right sum");
		
		
	}
	
	@Test
	@DisplayName("when adding two negative  numbers")
	void testsubNegative() {
		assertEquals(2,m.sub(5, 3),"return the right sum");
	}
}
	
	
	@Test
	void AssertAll() {
		
		assertAll(
				() ->assertEquals(4,m.multiply(2,2)),
				
				() ->assertEquals(6,m.multiply(2,3))
				
				);
		
	
	}
	//assert supiler values 
	@Test
	@DisplayName("when adding two negative  numbers")
	@Tag("Math")
	void testsubNegative() {
		int actual= 2;
		int expected=m.sub(5, 3);
		assertEquals(  actual, expected);
		}
	
	
	@Test
	@Tag("Circle")
	void computerCircleArea1() {

		assertEquals(314.1592653589793,m.computerCircleArea(10),"should retuen right circle area");
	}
	
	@Test
	
	void m1() {
		System.out.println("Hello");
	}
	
}
