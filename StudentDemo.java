package module2;
import java.util.*;

class Student {
    String name;
    String regNo;
    String course;
    int[] marks = new int[6];
    int total;
    int rank;

    Student(String name, String regNo, String course, int[] marks) {
        this.name = name;
        this.regNo = regNo;
        this.course = course;
        this.marks = marks;
        calculateTotal();
    }

    void calculateTotal() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
    }

    void displayStudent() {
        System.out.println(regNo + "\t" + name + "\t" + course + "\t" + total + "\t" + rank);
    }
}

public class StudentDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Reg No: ");
            String regNo = sc.nextLine();
            System.out.print("Course: ");
            String course = sc.nextLine();
            int[] marks = new int[6];
            for (int j = 0; j < 6; j++) {
                System.out.print("Enter mark for subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine();
            students[i] = new Student(name, regNo, course, marks);
        }
        Arrays.sort(students, (s1, s2) -> s2.total - s1.total);
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && students[i].total == students[i - 1].total) {
                students[i].rank = students[i - 1].rank;
            } else {
                students[i].rank = rank;
            }
            rank++;
        }
        System.out.println("RegNo\tName\tCourse\tTotal\tRank");
        for (int i = 0; i < n; i++) {
            students[i].displayStudent();
        }
        sc.close();
    }
}


