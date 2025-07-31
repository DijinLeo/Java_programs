
package module2;
import java.util.Scanner;
class Box1{
	double width;
	double length;
	double depth;
	Box1(double w,double l,double d){
		width=w;
		length=l;
		depth=d;
	}

double volume() {
	return width*length*depth;
}}

public class BoxDemo {
	public static void main(String[] args) {
		System.out.println("Enter the length,width and depth:\n");
		Scanner sc=new Scanner(System.in);
		double length=sc.nextDouble();
		double width=sc.nextDouble();
		double depth=sc.nextDouble();
	    Box1 box=new Box1(length,width,depth);
	    System.out.println("Volume is"+box.volume());
		
		
	}

}
