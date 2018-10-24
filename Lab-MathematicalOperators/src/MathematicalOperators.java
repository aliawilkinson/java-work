
public class MathematicalOperators {
	public static void main(String[] args) {
		//define variables
	    int x = 5;
	    int y = 3;
	    int z;


	    //simple addition
	    z = x + y;
	    System.out.println("x + y = "+z);
	    
	    //simple subtraction
	    z = x - y;
	    System.out.println("x - y = "+z);

	    //simple multiplication
	    z = x * y;
	    System.out.println("x * y = "+z);
	    
	    //simple division
	    z = x / y;
	    System.out.println("x / y = "+z);
	    
	    //simple modulus
	    z = x % y;
	    System.out.println("x % y = "+z);
	    
	    //float vs. int
	    float f = 3.6f;
	    int i = 22;
	    double result = f + i;
	    System.out.println(result);
	    
	    int a = 4;
	    System.out.println(a<4 ? "a is greater than 4" : "a is less than 4");
	}
}
