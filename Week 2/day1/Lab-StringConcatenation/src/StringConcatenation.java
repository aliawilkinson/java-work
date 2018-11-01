
public class StringConcatenation {
	public static void main(String[] args) {
		String beginning = "Hello ";
		
		String end = "World";
		String combo = beginning + end;
		
		System.out.println(combo);
		long l = 203L;
		
		System.out.println("The value of l: "+ l);
		boolean b = true;
		
		System.out.println(b + " is true");
		
		int x = 2;
	    int y = 3;
	    // nums forced to string before operation
	    System.out.println("The sum of x and y is " + x + y);
	    //nums separated before forced to string by ()
	    System.out.println("The sum of x and y is " + (x + y));
	    //nums added first due to order
	    System.out.println(x + y + "is the sum of x and y.");
	}

}
