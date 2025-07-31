package module2;

import java.util.Scanner;

class MyCalculator{
	double num1;
	double num2;
	MyCalculator(double n1,double n2){
		num1=n1;
		num2=n2;
	}

double add() {
	return num1+num2;
    }
double subtract() {
	return num1-num2;
    }
double multiply() {
	return num1*num2;
    }
double divide() {
	if(num2==0) {
		System.out.println("denominator Cannot be zero");
		return Double.NaN;
	}
	else {
	    return num1/num2;
    }
}
public class CalculatorDemo {
	public static void main(String[] args) {
		char c='y';
		Scanner sc=new Scanner(System.in);
		while(c=='y') {
			
			System.out.println("--- Calculator Menu ---\n"
					+ "1. Add\n"
					+ "2. Subtract\n"
					+ "3. Multiply\n"
					+ "4. Divide\n"
					+ "Enter your choice (1-4):");
			int choice=sc.nextInt();
			System.out.println("Enter two numbers: ");
			double num1=sc.nextDouble();
			double num2=sc.nextDouble();
			MyCalculator cal=new MyCalculator(num1,num2);
			double result=0;
			int flag=1;
			if(choice==1) {
				result=cal.add();
			}
			else if(choice==2) {
				result=cal.subtract();
			}
			else if(choice==3) {
				result=cal.multiply();
			}
			else if(choice==4) {
				result=cal.divide();
			}
			else {
				System.out.println("Invalid choice\n");
				flag=1;
			}
			if(flag==1) {
				System.out.println("Result= "+result);
			}
			System.out.println("Do you want to continue? (y/n):");
			c = sc.next().charAt(0);
		}
		sc.close();
	}
}
}
