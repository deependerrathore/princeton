/******************************************************************************
 *  Compilation:  javac Distance.java
 *  Execution:    java Distance x y
 *  
 *  Prints the distance from (x, y) to the origin, where x and y
 *  are integers.
 * 
 *  % java Distance 3 4
 *  distance from (3, 4) to (0, 0) = 5.0
 *
 *  % java Distance 5 12
 *  distance from (5, 12) to (0, 0) = 13.0
 *
 *  % java Distance 2 1
 *  distance from (2, 1) to (0, 0) = 2.23606797749979
 *
 ******************************************************************************/

public class Distance{
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);

		double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

		System.out.println("the distance between ("+ x + "," + y + ") to (0,0) is " + distance);
	}
}