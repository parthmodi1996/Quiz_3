
public class Triangle extends GeometricObject{
	//Initialize the variables side1, side2 ad side3 as the three sides of Triangle
	private static double side1 = 1.0;
	private static double side2 = 1.0;
	private static double side3 = 1.0;
	
	//Create a no-arg constructor for Triangle
	Triangle()
	{
	}
	
	//Create a constructor of Triangle that takes in the values of 3 sides of the Triangle 
	Triangle (double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//Generate Getters and Setters for side1
	public static double getSide1() {
		return side1;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	//Generate Getters and Setters for side2
	public static double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	//Generate Getters and Setters for side3
	public static double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	//Override the getArea() method in the GeometricObject in order to obtain the area of the Triangle
	@Override
	public double getArea() {
		double p = getPerimeter()/2;
		double a = getSide1();
		double b = getSide2();
		double c = getSide3();
		double x = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return Math.round(x * 100d)/100d;
	}
	
	//Override the getParameter()method in GeometricObject to obtain perimeter of the Triangle
	@Override
	public double getPerimeter() {
		double perimeter = (getSide1() + getSide2() + getSide3()); 
		return Math.round(perimeter * 100d)/100d;
	}
	
	//Generate toString() method that provides the String information of the Triangle
	public String toString() {
		return ("The Triangle has sides A = " + getSide1() + " , B = " + getSide2() + " and C = " + getSide3() + ". Its Area = " + getArea() + ", and Perimieter = " + getPerimeter());
	}
}