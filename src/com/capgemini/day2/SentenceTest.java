package com.capgemini.day2;

import static org.junit.Assert.assertEquals;

class SentenceTest {


			void testcorrection()
			{
				assertEquals("this is a sentence", Sentence.correction("this is is a sentence","is",3));
			}

		
	}


