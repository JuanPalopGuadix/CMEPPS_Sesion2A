package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cmepps.calculadora;

class calculadoraTest {
	private int value1;
	private int value2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
		value1=5;
		value2=3;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

	@Test
	void testSuma() {
		int expected=8;
		int actual = calculadora.suma(value1, value2);
		assertEquals(expected,actual);
	}

	@Test
	void testResta() {
		int expected=2;
		int actual = calculadora.resta(value1, value2);
		assertEquals(expected,actual);
	}

	@Test
	void testDivide() {
		int expected=1;
		int actual = calculadora.divide(value1, value2);
		assertEquals(expected,actual);
	}

	@Test
	void testMultiplica() {
		int expected=15;
		int actual = calculadora.multiplica(value1, value2);
		assertEquals(expected,actual);
	}
	@Test
	void testDivideEntre0() {
		value2=0;
		int expected=-1;
		int actual = calculadora.divide(value1, value2);
		assertEquals(expected,actual);
	}

}
