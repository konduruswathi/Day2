package com.capgemini.day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DdmmyyyyTest {

	@Test
	void testcheckDate() {
		assertEquals("15/May/1995",Date.checkDate(15,05,1995));
		assertEquals("16/May/1995",Date.checkDate(16,05,1995));
	}

}
