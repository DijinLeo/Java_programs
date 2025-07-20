package oops2535;
import java.util.Scanner;
public class primenum {
	public static void main(String[] arg) {
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int i,flag=0, num=sc.nextInt();
		for (i=0;i<=num/2;i++) {
			if(i%2==0) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==0) {
			System.out.println(num+" is not a prime number");
		}
		else {
			System.out.println(num+" is  a prime number");
		}
	}

}
