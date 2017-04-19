package codeBoard;

/**
 * Main class of the Java program. 
 * You can use this class to test your code, but put your methods in the TwoDArrays class
 */

public class Main {

    public static void main(String[] args) {
        
        // we print a heading and make it bigger using HTML formatting
        System.out.println("<h4>-- 2 Dimensional Arrays (Practice Methods) --</h4>");
        
        // create the finder and call the function to find the maximum element
        int[][] g1 ={{9, 8, 7, 6},           
        	{5, 4, 12, 1},
   	        {3, 19, 2, 13}};

        int maxDis = TwoDArrays.maxDistBetweenAny2(g1);
        
        System.out.println("The maximum distance between any two elements in g1 is: " + maxDis);
         System.out.println("You can perform other tests by editing the code in the Main.java class");
    }
}
