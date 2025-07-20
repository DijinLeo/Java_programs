package oops2535;
import java.util.Scanner;
public class reverse {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int revnum=0,rev=0,num=sc.nextInt();
		while (num!=0) {
			rev=num%10;
			num=num/10;
			revnum=revnum*10+rev;
		}
		System.out.println("Reverse number: "+revnum);
	
	}
	

}
