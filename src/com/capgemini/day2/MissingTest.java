
		package com.capgemini.day2;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class MissingTest {

	@Test
	void test()
	{
		assertEquals(2, Missing.find(new int[] {0,1,3,4,5},6));
	}

}