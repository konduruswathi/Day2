package com.capgemini.day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IncomeTaxTest {

	@Test
	void testfindIncomeTax() {
		assertEquals(0,IncomeTax.findIncomeTax(100000));
		assertEquals(63000,IncomeTax.findIncomeTax(315000));
		assertEquals(100000,IncomeTax.findIncomeTax(500000));
		
	
	}

}
