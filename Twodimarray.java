//author:Vismaya Theresa Benny
//Two dimensional array in java

package jav;
import java.util.Scanner;
public class Twodimarray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int [] []matrix= {
				{1,2,3},
				{4,5,6,7},
				{7,8}
		
		};
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
		}
			System.out.println();
		}
			
	}
	}


