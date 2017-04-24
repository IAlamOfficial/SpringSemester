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
        String[][] t = new String[2][3];	
        String[] lst = {"hello", "blah",  "boom", "elephant"};
        String rtn[][] = TwoDArrays.twoCharsTo2D(t, lst);  
        int maxDis = TwoDArrays.maxDistBetweenAny2(g1);
        String[] r = {"Joe", "Kim", "Chris"};
        int[][] g = {{100, 90, 96, 98, 99},
        		{100, 90, 96, 98, 99},
        		 {100, 90, 96, 98, 99}};


         int[][] g3 ={{9, 8, 7, 6},           
                      {5, 4, 12, 1},
                      {3, 19, 2, 13}};
         
         int[][] result = TwoDArrays.removeRowCol(g3, 0, 1);
                                

      int[][] g2 ={{-3, 4, -8},           
                 	{14, 2, 21},
      	          {3, 32, -3}};

result =     TwoDArrays. removeRowCol(g2, 1, 1);
      for(int i = 0; i < result.length; i++){
    	  	for(int j = 0; j <result[i].length; j++){
    	  		System.out.print(result[i][j]+", ");
      		}	
    	  	System.out.println("");
      }
      int[][] y ={{9, 8, 7, 6},           
    	         {5, 4, 2, 1},
    	         {3, 9, 2, 3}};
      int[] array = TwoDArrays.getNeighbors(y, 0, 0);
      for(int a = 0;a < array.length; a++){
    	  System.out.println(array[a]);
      }
        
        System.out.println("The maximum distance between any two elements in g1 is: " + maxDis);
        System.out.println("this method produces " + TwoDArrays.bestAverage(r, g));
        System.out.println("You can perform other tests by editing the code in the Main.java class");
    }
}
