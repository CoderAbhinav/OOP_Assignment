package assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class portal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        int inp = -1;
        System.out.println("OOP Assignment 1");

        while (inp != 0)
        {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Result\n>>> ");
            inp = Integer.parseInt(sc.nextLine());
            if(inp == 1)
            {
                System.out.print("Enter student UID\n>>>");
                String student_uid = sc.nextLine();
                System.out.print("Enter student Name\n>>>");
                String student_name = sc.nextLine();
                int average;
                int total = 0;
                for(int i = 0; i<3; i++)
                {
                    System.out.printf("Enter Marks in Subject%d\n>>>", i);
                    total += Integer.parseInt(sc.nextLine());
                }
                if(total == 0)
                {
                    average = total;
                }
                else
                {
                    average = total/3;
                }
                studentList.add(new Student(student_uid, student_name, average));

            }
            else if(inp == 2)
            {
                System.out.printf("%5s%10s%5s%8s\n", "UID","NAME", "AVG", "GRADE");
                for(Student s: studentList)
                {
                    s.printDetails();
                }
            }
        }

    }
}
