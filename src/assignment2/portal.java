package assignment2;

import java.util.Scanner;

public class portal {
    static String[] idArray = new String[20];
    static String[] nameArray = new String[20];
    static double[] salaryArray = new double[20];
    static int size = 0;
    static Scanner sc = new Scanner(System.in);

    public static int GetEmployeeIndexById(String id){
        for(int i = 0;i < size; i++){
            if(idArray[i].equals(id)){
                return i;
            }
        }
        return -1;
    }

    public static void addEmployee(){
        // declarations
        String id, name;
        double salary;

        // taking input
        System.out.print("Enter the Employee ID\n>>> ");
        id = sc.nextLine();
        System.out.print("Enter the Employee Name\n>>> ");
        name = sc.nextLine();
        System.out.print("Enter the Employee Salary\n>>> ");
        salary = Double.parseDouble(sc.nextLine());

        // setting up value;
        idArray[size] = id;
        nameArray[size] = name;
        salaryArray[size] = salary;
        size++;
    }

    public static void printDatabase(){
        System.out.printf("\n%10s%20s%10s\n", "UID", "NAME","SALARY");
        for(int i = 0 ;i<size; i++){
            System.out.printf("\n%10s%20s%10s", idArray[i], nameArray[i], salaryArray[i]);
        }

    }

    public static void printEmployee(int i){
        System.out.printf("\n%10s%20s%10s\n", "UID", "NAME","SALARY");
        System.out.printf("\n%10s%20s%10s", idArray[i], nameArray[i], salaryArray[i]);
    }


    public static int displayOptions(){
        // displaying options
        System.out.printf("\nOptions\nSize Of Database %d\n", size);
        System.out.println("1.Add Employee");
        System.out.println("2.Search Employee By ID");
        System.out.println("3.Print Database");
        System.out.println("0.Exit System");
        System.out.print(">>> ");
        Scanner sc = new Scanner(System.in);
        // taking user input
        return Integer.parseInt(sc.next());
    }

    public static void main(String[] args) {

        int option = -1;
        while (option != 0){
            option = displayOptions();
            if(option == 1){
                addEmployee();
            }
            else if(option == 2){
                System.out.print("Enter ID to be searched\n>>> ");
                String id = sc.next();
                int pos = GetEmployeeIndexById(id);

                if(pos != -1){
                    printEmployee(pos);
                }
                else {
                    System.out.println("Given ID doesn't exist");
                }
            }
            else if(option == 3){
                printDatabase();
            }
        }

        sc.close();

    }

}
