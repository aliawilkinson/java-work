
public class ExampleOne {
	
	public static void main(String[] args) {
		String val = stringReturner();
		System.out.println(val);
		printName("Jennifer");
	}
	
	public static String stringReturner() {
		return "Hello";
	}
	
	public static void printName(String name) {
		System.out.println("Hello " + name);
	}
}
