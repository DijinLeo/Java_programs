package oops2535;
import java.util.Scanner;
public class fibonacci {
	public static void main(String[] arg) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner (System.in);
		int sum=0,First=0,Second=1,num=sc.nextInt(),i;
		System.out.println("Fibonacci series: ");
		System.out.println(First+"\n"+Second);
		for(i=2;i<num;i++) {
			sum=First+Second;
			First=Second;
			Second=sum;
			
			System.out.println(sum);
		}
	}
	
}
