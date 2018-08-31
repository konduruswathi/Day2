package com.capgemini.day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareNumber {

	@Test
	void testfindSquare() 
	{
		assertEquals(25,Square.findSquare(5));
		assertEquals(121,Square.findSquare(11));
	}

}
