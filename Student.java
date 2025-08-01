//Author:Vsmaya Theresa Benny
//Java program using Static

package module2;

	class Stud {
	String name;
	int rollNumber;
	static int studentCount=0;
	Stud(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
		studentCount++;
	}
	 static void  displayStudentCount() {
		 System.out.println("Student Count:"+studentCount);
	}
	}
	public class Student{
		public static void main(String[]args) {
			Stud student=new Stud("Maria",12);
			Stud student1=new Stud("Annu",15);
			Stud student2=new Stud("Alpho",13);
			Stud.displayStudentCount();
			
			
			
		}
	}


