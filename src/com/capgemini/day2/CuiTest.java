
		package com.capgemini.day2;

		import static org.junit.jupiter.api.Assertions.*;

		import org.junit.jupiter.api.Test;

		

		class CuiTest {

			@Test
			void testCui() 
			{
				assertEquals(1,Cui.checkId("Swathi", "12345", "Swathi", "12345"));
				assertEquals(0,Cui.checkId("nikitha","23456","Nikitha","23456"));
			}

		
	}


