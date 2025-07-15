package module1;
import java.util.Scanner;
public class mydetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        double cgpa,attendance;
        String mobile_no,name;
        System.out.println("Enter the full name:");
        name=sc.nextLine();
        System.out.println("Enter the age:");
        age=sc.nextInt();
        System.out.println("Enter the mobile number:");
        mobile_no=sc.nextLine();
        System.out.println("Enter the CGPA: ");
        cgpa=sc.nextDouble();
        System.out.println("Enter the attendance %: ");
        attendance=sc.nextDouble();
        System.out.println("My Details:\n");
        System.out.println("Full Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobile_no);
        System.out.println("CGPA: "+cgpa);
        if(attendance>90.0){
            System.out.println("Attendance Mark: 10");
        }
        else{
            System.out.println("Attendance Mark: "+(attendance/10));
        }
    }

    
}