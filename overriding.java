package module2;
class Vehicle{
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void display(){
		System.out.println("Brand :"+brand);
		System.out.println("model: "+model);
	}
}
class Car extends Vehicle{
	String fueltype;
	Car(String brand,String model,String fueltype){
		super(brand,model);
	  this.fueltype=fueltype;
	}
	public void display() {
		super.display();
		System.out.println("Fuel type: "+fueltype);
	}
}
class ElectricCar extends Vehicle{
	double batteryCapacity;
	ElectricCar(String brand,String model,double batteryCapacity){
		super(brand,model);
		this.batteryCapacity=batteryCapacity;
	}
	public void display() {
		super.display();
		System.out.println("batteryCapacity: "+batteryCapacity);
}
}
public class overriding {
	public static void main(String[]args) {
		Car car=new Car("brand","model","Petrol");
		car.display();
		System.out.println();
		ElectricCar caar=new ElectricCar("B","f",5000);
		caar.display();
		System.out.println();
		
	}
}


