package com.capgemini.day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscountTest {

	@Test
	void testcalcDiscount() {
		assertEquals(780,Discount.calcDiscount(1200));
		assertEquals(65,Discount.calcDiscount(100));
		
	}

}
