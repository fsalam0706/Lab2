package Bubble;

public class DriverB {
	public static void main(String a[]){
		long startTime = System.nanoTime();
		int n = 100; 
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
	    	input[i] = (int) Math.random();
	    	MyBubbleSort sorter = new MyBubbleSort();
	    	sorter.bubbleSort(input);
	    	for(int j:input){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	        for (int j = 0; j < n-1; j++) {
	        	if (input[j] >= input[j+1]) {
	        		System.out.println("Array out of order.");
	        		break;
	        	}
	        }  
		}
	    long endTime = System.nanoTime() - startTime;
	    long t1 = endTime/1000000;
	    System.out.println(" ");
	    System.out.println(" ");
	    System.out.println("Start Time of Program: " + startTime);
	    System.out.println(" ");
	    System.out.println("Time taken to run program in nanoseconds: " + endTime); 
	    System.out.println("Time taken to run program in milliseconds: " + t1); 
	}
}
