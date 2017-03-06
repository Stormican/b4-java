import java.util.ArrayList;

public class ArrayRunner {

	public static void main(String[] args) {
		
		// Strings
		String myString = "I fo sho lub/dub computer science";
		// a String is a char array
		System.out.println("String length: " + myString.length());
		System.out.println("Equal us .equal NOT == " + myString.equals("Java"));
		System.out.println("charAt 12 " + myString.charAt(12));
		System.out.println("substring(n)" + myString.substring(2));
		System.out.println("substring(n)" + myString.substring(9,17));
		System.out.println();
		
		
		// arrays
		/*
		 * 
		 
		int[] myInt = new int [6];
		myInt[0] = 0;
		myInt[1] = 10;
		myInt[2] = 20;
		myInt[3] = 30;
		myInt[4] = 40;
		myInt[5] = 50;
		*/
		// works ONLY at the beginning
		// later in your program you MUST use [] ONLY no more curly's!
		int [] myInt = {0,10,20,30,40,50,60};
		//myInt[1] = 35;
		
		// find 30, replace it with 35
		
		for (int i = 0; i < myInt.length; i++){
			if (myInt[i] == 30){
				myInt[i] = 35;
			}
		}
		
		
		for (int i = 0; i < myInt.length; i++){
			
			System.out.println("element i has the value of: " + myInt[i]);
			System.out.println();
		}
		
		
		
		// matrices - 2D array or 3D arrays ...
		
		/*
		int[][] my2D = new int[3][4]; // int[row][col]
		
		
		my2D[0][0] = 0;
		my2D[0][1] = 1;
		my2D[0][2] = 2;
		my2D[0][3] = 3;
		
		my2D[1][0] = 4;
		my2D[1][1] = 5;
		my2D[1][2] = 6;
		my2D[1][3] = 7;
		
		my2D[2][0] = 8;
		my2D[2][1] = 9;
		my2D[2][2] = 10;
		my2D[2][3] = 11;
		*/	
		int [][] my2D = {
				{0,1,2,3},
				{4,5,6,7},
				{8,9,10,11}
		
		};
		
		for(int row = 0; row < my2D.length; row++){
			// inner array(s), usually called "col"
			for(int col = 0; col < my2D[row].length; col++){
				System.out.println("row = " + row + ", col = " + col
						+ col + ", value = " + my2D[row][col]);
		
			}
		
			
		}
		
		
		// ArrayList
		
		ArrayList <String> myAL = new ArrayList <String> ();
		
		myAL.add("Hello");
	}

}