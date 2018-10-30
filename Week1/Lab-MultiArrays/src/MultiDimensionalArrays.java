
public class MultiDimensionalArrays {
	public static void main(String[] args) {
		int[][][] my3dArray = new int[3][3][3];
		
		my3dArray[0][0][0] = 1;
		System.out.println("first element in third array: "+my3dArray[0][0][0]);
		
		int[][] my2dArray = {{1,2,0}, {4,5,6}, {1,4,5}};
		System.out.println("length of 2d array: "+my2dArray.length);
		
		System.out.println("third element in second array in 2d array: "+my2dArray[1][2]);
	}

}
