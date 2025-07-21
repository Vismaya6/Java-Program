//author:Vismaya Theresa Benny
//Java program using overloaded method

class Calculator{
	public void add(int num1,int num2) {
		int add=num1+num2;
		System.out.println("Sum of two integers: "+add);
	}
	public void add(int num1,int num2,int num3) {
		int add=num1+num2+num3;
		System.out.println("Sum of three integers: "+add);
	}
	public void add(double num1,double num2) {
		double add=num1+num2;
		System.out.println("Sum of two double values: "+add);
	}
	public void add(String name,int num) {
		String add=name+num;
		System.out.println("Concatenated: "+add);
	}
	
}
public class Over {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.add(5, 6);
		calculator.add(3,3,3);
		calculator.add(3.5, 3.5);
		calculator.add("Maria", 5);
	}

}
