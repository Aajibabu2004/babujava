
class Car{
	String colour = "Grey";
	String model = "I10";
	String companyName = "Hyundai";
	
	public void start()
	{
		System.out.println("Car Engine Has Started....");
	}
	
	public void accelerate()
	{
		System.out.println("Car is Moving...." );
	}
	
	
	public void brake()
	{
		System.out.println("Car is Slowing Down...");
	}
	
	public void stop()
	{
		System.out.println("Car Engine has Stopped....");
	}
	
}


public class ClassObj {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("Car Colour : "+c1.colour);
		System.out.println("Car Model : "+c1.model);
		System.out.println("Car Company Name : "+c1.companyName);
		c1.start();
		c1.accelerate();
		c1.brake();
		c1.stop();

	}

}
