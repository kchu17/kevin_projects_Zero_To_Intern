
public class Box {

	private static double length;
	private static double width;
	private static double height;
	public Box(double length, double width, double height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
	}
	//Constructors Overloading
	public Box(double sideLength)
	{
		this.length = sideLength;
		this.width = sideLength;
		this.height = sideLength;
		
	}
	
	//gets the length of the instance and returns it
	public double getLength()
	{
		return this.length;
	}
	
	//gets the new value for the instance's length
	public void setLength(double newLength)
	{
		this.length = newLength;
	}
	
	public double computeArea()
	{
		double result = this.length * this.width;
		return result;
	}
	
	public double getVolume()
	{
		double result = this.computeArea() * this.height;
		return result;
	}
	
	public static double getVolume(double length, double width, double height)
	{
		double result = length * width * height;
		return result;
	}
	
	public static void main(String[] args) 
	{
		Box firstBox = new Box(10,15,20);
		Box secondBox = new Box(10,15,20);
		
		System.out.println(firstBox.equals(firstBox));
//		Box firstBox = new Box(10, 15, 20);
//		System.out.println(firstBox.getVolume());
//		firstBox.setLength(19);
//		System.out.println(firstBox.getLength());
//		System.out.println(getVolume(5,5,5));
//		Box cube = new Box(5);
	}
	@Override
	public boolean equals(Object ojb)
	{
		return true;
	}
	

}
