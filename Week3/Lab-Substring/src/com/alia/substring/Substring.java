package com.alia.substring;

	public class Substring { 
	    public static void main(String[] args) { 
	        String input = "helloworld"; // Set to test value
	        String test = "world"; // Set to test value  
	        System.out.println(isSubstring(input, test));   
	    }

		private static boolean isSubstring(String input, String test) {
			if(input.length() == 0 || test.length() == 0) {
				System.out.println("lengths " + input.length()+ " " + test.length());
				return false;
			}
			if (input.length() < test.length()) {
				System.out.println("comparing lengths");
	        	return false;
	        }
				if (input.toLowerCase().contains(test.toLowerCase())){
					System.out.println("passed test case");
					return true;
				}

			System.out.println("hit final return");
			return false;
		}   

	    
	}
