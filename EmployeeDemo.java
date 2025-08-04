package module2;
import java.util.Scanner;
class Employee {
    double empId;
    String empName;
    double salary;
    Employee(double id, String name, double salry) {
        empId = id;
        empName = name;
        salary = salry;
    }
    void displayEmployee() {
    System.out.println(empId +"\t\t" + empName +"\t\t" + salary);
    }
}

public class EmployeeDemo {
	public static void main(String[] args) {
		
		System.out.println("enter the number of employees:\n");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		Employee empdet[] = new Employee[num];
		for(int i=0;i<num;i++) {
		    System.out.println("Enter Employee ID:");
		    double id = sc.nextDouble();
		    sc.nextLine(); 
		    System.out.println("Enter Employee Name:");
		    String name = sc.nextLine();
		    
		    System.out.println("Enter Employee Salary:");
		    double salary = sc.nextDouble();
		    empdet[i] = new Employee(id, name, salary);
		}
		System.out.println("Employee Details:\nEmployee Id\tEmployee Name\tSalary\n");
		for (int i = 0; i < num; i++) {
		    empdet[i].displayEmployee();
		    System.out.println("\n");
		    }
		sc.close();
		}
}
