
public class StringMethods {
	public static void main(String[] args) {
		String str = "Hello";
		String s = new String("Hello");
		
		//values are the same
		System.out.println(str.equals("Hello"));
		//checks memory sameness. Different references, so false.
		System.out.println(str == s);
		//checks value sameness
		System.out.println(str.equals(s));
		
		//use the length method
		System.out.println(str.length());
		
		//use the indexOf() method
		System.out.println(str.indexOf('H'));
		
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		for (char ltr: letters) {
			str = str.toLowerCase();
			if (str.indexOf(ltr) != -1) {
				System.out.println("The letter " + ltr + " is part of the string");
			}
		}
	}

}
