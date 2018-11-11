package com.alia.palindrome;
	
	public class Palindrome {
	    
		public static void main(String[] args) {
	        String input = "racecar"; // Set to test value
	        System.out.println(isPalindrome(input));
	    }

	    public static boolean isPalindrome(String input) {
	    	System.out.println(input);
	    	if (input == null) return false;
	    	int length = input.length();
	    	int c = 0;
	    	String[] phraseToArr = input.split("", length);
	    	
	    	System.out.println(phraseToArr[0]);
	    	
	    	while (c <= length/2) {
	    		System.out.println(phraseToArr[c]);
	    		System.out.println(phraseToArr[length - 1 - c]);
	    		if (!phraseToArr[c].equals(phraseToArr[length - 1 - c])) {
	    			return false;
	    		} else {
	    			c = c + 1;
	    		}
		            
		        
	    	}
	    		 return true;
	    }
	}
