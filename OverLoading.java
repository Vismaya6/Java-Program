//Author :Vismaya Theresa Benny
//Java program to find area using overloaded method
class AreaCalculator{
	public void area(double radius) {
		double area=3.14*radius*radius;
		System.out.println("Area of circle: "+area);
	}
	public void area(float length,float breadth) {
		float area=length*breadth;
		System.out.println("Area of rectangle: "+area);
	}
	public void area(double length,double breadth) {
		double area=0.5*length*breadth;
		System.out.println("Area of triangle: "+area);
	}
	public void area(int side) {
		int area=side*side;
		System.out.println("Area of square: "+area);
	}
	
}


public class OverLoading {
	public static void main(String[] args) {
		AreaCalculator areacalculator=new AreaCalculator();
		areacalculator.area(5.2);
		areacalculator.area(5.5f,6.5f);
		areacalculator.area(5.5,6);
		areacalculator.area(5);

}
}
