package module1;
import java.util.Scanner;
public class TernaryOperationDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int firstNumber,secondNumber;
        System.out.println("Enter the first number:");
        firstNumber=sc.nextInt();
        System.out.println("Enter the second Number:);");
        secondNumber=sc.nextInt();
        int bigNumber;
        bigNumber=firstNumber>secondNumber?firstNumber:secondNumber;
        System.out.println("I am "+bigNumber+",the big number");

    }
}