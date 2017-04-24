package codeBoard;

import java.util.ArrayList;

/**
 * This class provides functions to search in arrays.
 * 
 */
 
public class TwoDArrays {


/**
 * 1) Given a 2 dimensional array of unique ints write a method that will return the maximum distance between any 2 ints in the 2D array.
 * 
 * EXAMPLE 1
    int[][] g1 ={{9, 8, 7, 6},           
        	{5, 4, 12, 1},
   	        {3, 19, 2, 13}};

    maxDistBetweenAny2(g1)returns 18
    
    EXAMPLE 2
    int[][] g2 ={{-3, 4, -8, 16},           
   	            {15, 14, 2, 21},
            	{5, 19, 32, -1}};

    maxDistBetweenAny2(g2)  returns 40
    
*/
    public static int maxDistBetweenAny2(int[][] nums){
        int maxDistance = 0; 
        int l = 0;
        int s = 0;
        Boolean first = true;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(!first){
                	if(nums[i][j] > l){
                		l = nums[i][j];
                	}else if(nums[i][j] < s){
                		s = nums[i][j];
                	}
                }else{
                	first = false;
                }
            }
        }
        maxDistance = l-s;
        return maxDistance;
    }
    
    /**
     * Given a 2D array of Strings and a non-empty array of 
     * Strings where each string is of length 2 or more.  
     * Write a method that will place the first 2 chars of each 
     * String into a 2D array in row major order.  If the 1D array 
     * runs out of strings then fill in the rest of the elements with "$$".  
       (This method is definitely an AP level question)


     *   String[][] t = new String[2][3];						        //This is a 2d Array
     *   twoCharsTo2D(t, {"hello", "blah",  "boom", "elephant"})  ?       "he", "bl", "bo"
		                                								 "el", "$$", "$$"


//Preconditions:  1.  words.length > 0
//		  2.  words.length<=(table.length * table[0].length)
//		  3.  Each element in words will be a string of length 2 or more
*/

    public static String[][] twoCharsTo2D(String[][] table, String[] words){
        boolean empty = false;
    	int w = 0;
    	for(int i = 0; i<table.length; i++){
        	for(int j = 0; j < table[i].length; j++){
        		if(w < words.length){
        			table[i][j] = words[w].substring(0,2);
        		}else{
        			table[i][j] = "$$";
        		}
        		w++;
        	}
        }
    	return table;
    }

/**
 * 3)  Given an array of Strings containing unique names, and a 2D array of ints where each row 
 * represents the test grades of the person at a specific index, write the method that will return 
 * the name of the person with the greatest test average(mean).

String[] r = {"Joe", "Kim", "Chris"};
int[][] g = {{80, 90, 90, 100, 70},
		 {90, 60, 75, 80, 80},
		 {100, 90, 96, 98, 99}};

bestAverage(r, g) returns "Chris"

Preconditions:  
1.  roster.length > 0
2.  roster.length == grades.length
*/
    public static String bestAverage(String[] roster, int[][] grades){
        int bestAvg = -1;
        double bestavg = 0.0;
        int cur;
        double avg;
        boolean check = false;
        for (int i = 0; i < roster.length; i++){
        	cur = 0;
        	for(int j = 0; j < grades[i].length; j++){
        		cur += grades[i][j];
        	}
        	avg = cur/grades[i].length;
        	if(avg > bestavg){
        		bestAvg = i; 
        		bestavg = avg;
        		check = false;
        	}else if(avg == bestavg){
        		check = true;
        	}
        }
        
        if(bestAvg < 0 || check == true){
        	return "Nobody";
        }else{
        	return roster[bestAvg];
        }
    }
    
    /**
     * Given a non-empty 2D array of ints and 2 ints that represent a row and a column that 
     * exists in the 2D array return a 2D array without the given row and without the given column.  
     * 
     * Example 1
     * int[][] g1 ={{9, 8, 7, 6},           
     *              {5, 4, 12, 1},
     *              {3, 19, 2, 13}};
     * 
     * removeRowCol(g1, 0, 1) returns {{5, 12, 1},
                                        {3, 2, 13}};
                             
    *Example 2
    *int[][] g2 ={{-3, 4, -8},           
    *          	{14, 2, 21},
   	*          {3, 32, -3}};

    * removeRowCol(g2, 1, 1) returns {{-3, -8},
   	                                {3, -3}};


        Preconditions:  
          1.  mat.length >=3
		  2.  mat[0].length>=3
		  3.  0 <= row <= mat.length-1 and 0 <= col <= mat[0].length-1
*/
    public static int[][] removeRowCol(int[][] mat, int row, int col){
    	int rowLim = mat.length - 1;
    	int colLim = mat[0].length - 1;
    	int colcur = 0;
    	int rowcur = 0;
    	
    	
    	int[][] nothing = new int[rowLim][colLim];
        for(int i = 0; i < mat.length; i++){
        	if(i != row){
        		System.out.println("i worked and it is "+ i);
        		colcur = 0;
        		for(int j = 0; j < mat[i].length; j++){
	        		if(j != col){
	        			System.out.println(" - j worked and it is "+ j);
	        			nothing[rowcur][colcur] = mat[i][j];
	        			colcur++;
	        		}
	        		
	        	}
	        	
	        	rowcur++;
        	}
        }
        	
        
        return nothing;
    }


/**
 * Given a non-empty 2D array of ints and 2 ints that represent a row and a column that 
 * exists in the 2D array return an array of all the neighboring elements to the 
 * element located at (row, col).  A neighboring element is an element that is 
 * next to another element horizontally, vertically OR DIAGONALLY.  
 * 
 * (Note: if this sounds like something similar (but not identical) to an assignment you have done in the past, then you are right!)


 int[][] g ={{9, 8, 7, 6},           
   	         {5, 4, 2, 1},
   	         {3, 9, 2, 3}};

    getNeighbors(g, 0, 0) returns {8, 5, 4}
    getNeighbors(g, 1, 1) returns {9, 8, 7, 5, 2, 3, 9, 2}
    getNeighbors(g, 0, 2) returns {8, 6, 4, 2, 1}
    getNeighbors(g, 2, 3) returns {2, 1, 2}
    getNeighbors(g, 2, 2) returns {4, 2, 1, 9, 3}
*/
    public static int[] getNeighbors(int[][] grid, int row, int col){
        int[] nothing = new int[8];
        int tally = 0;
    	for(int i = row-1; i <= row+1; i++){
    		System.out.println("entered loop I is : " + i);	
    		for(int j = col-1; j <= col+1; j++){
        		System.out.println("*-entered 2nd loop J is : " + j);
    			if(((i >= 0 && i < grid.length) && (j >= 0 && j < grid[i].length)) && !(row == i && col == j)){
    	  			System.out.println("I is : " + i + " and j is " + j + " and tally is: "+ tally);
    	  			nothing[tally] = grid[i][j];
    	  			tally++;
    	  		}
      		}
        }
    	int[] perm = new int[tally];
    	for(int x = 0; x < perm.length; x++){
    		perm[x] = nothing[x];
    	}
    	
        return perm;
    }

}

