package com.capgemini.day2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongTest {

	
		

		

			@Test
			void testfindAllArmstrongNumbers() {
			assertArrayEquals(new int[] {153,370,371,407,0},Armstrong.findAllArmstrongNumbers(100,500));
			}

		}


