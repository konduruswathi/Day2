package com.capgemini.day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	void testcheckPalindrome() {
		assertEquals(true,Palindrome.checkPalindrome(121));
		assertEquals(true,Palindrome.checkPalindrome(151));
		assertEquals(false,Palindrome.checkPalindrome(152));
		assertEquals(false,Palindrome.checkPalindrome(-125));
	
	}

}
