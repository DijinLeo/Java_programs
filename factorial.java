package oops2535;
import java.util.Scanner;
public class factorial {
	public static void main(String[] arg) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int factorial=1,j=num;
		while(num>=1) {
			factorial*=num;
			num--;
		}
		System.out.println("Fcatorial of "+j+" is "+factorial);
	}

}
