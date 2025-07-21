import java.util.Scanner;
 class Cuboid {
	double length;
	double breadth;
	double height;
void setDimension(double l, double b, double h) {
	length =l;
	breadth =b;
	height = h;
}
	public double calculateVolume() {
		double volume = height*length*breadth;
		return volume;
	}
	public double calculateSurfaceArea() {
        return 2 * (length * breadth + height * breadth + length * height);
    }

}
public class CuboidDemo {
	public static void main(String[] args)
	{
				System.out.println("Please enter the length,breadth,height of the cuboid:");
				Scanner sc = new Scanner(System.in);
				double length = sc.nextDouble();
				double breadth= sc.nextDouble();
				double height = sc.nextDouble();
				Cuboid mybox = new Cuboid();
				mybox.setDimension(length,breadth,height);
				double volume =mybox.calculateVolume();
				System.out.println("Volume of the cuboid with dimensions: "+length+"* "
				+breadth+" *"+height+" is :"+volume);
				double surfaceArea = mybox.calculateSurfaceArea();
		        System.out.println("Surface Area of the box is: " + surfaceArea);
			}
	}package oops2535;

public class CUBOID {

}
