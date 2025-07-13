//Author:Vismaya Theresa Benny
  //Java Program using Switch
package module1;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the grade:");
		String grade=sc.next();
		switch(grade){
		case "A":
			System.out.println("Outstanding");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Poor");
			break;
		case "D":
			System.out.println("Fail");
			break;
		default:
			System.out.println("Error");
			sc.close();
			}
		}

}
