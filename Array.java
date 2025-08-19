//author:Vismaya Theresa Benny
//Array in java
package jav;
import java.util.Scanner;
public class Array {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of N:");
	    int n=sc.nextInt();
	    int [] array=new int[n];
	    System.out.println("Enter the elements:");
	    for(int i=0;i<n;i++) {
	    	array[i]=sc.nextInt();
	    }
	    //print
	    System.out.println("The given array:");
	    for(int num:array) {
	    	System.out.println(num+"\t");
	    }
	    System.out.println();
	    //largest
	    int largest=array[0];
	    for(int i=0;i<n;i++){
	    if(array[i]>largest) {
	    	largest=array[i];
	    }
	}
	System.out.println("Largest element:"+largest);
}
}
	    
	   
	    
		
	


