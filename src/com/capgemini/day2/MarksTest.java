package com.capgemini.day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksTest {

			void testcalculateG()
			{
				assertEquals("Passed",Marks.calculateG(70,70,70));
				assertEquals("Promoted",Marks.calculateG(50,70,70));
				assertEquals("Failed",Marks.calculateG(50,50,50));
				
			}
}	

		
	
	


