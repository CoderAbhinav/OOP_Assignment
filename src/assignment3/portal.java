package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class portal {

    static List<CovidPatient> covidPatientList;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        covidPatientList = new ArrayList<>();
        int selection = -1;
        while(selection != 0){
            System.out.println("\n1. Add Details Via Default Constructor");
            System.out.println("2. Add Details Via Overloaded Constructor");
            System.out.println("3. Print The Database");
            System.out.print("0. Exit System\n>>> ");
            selection = Integer.parseInt(sc.nextLine());

            if(selection == 1){
                String id, name, mobileNo;
                boolean isCovidPositive;
                System.out.print("Enter Patient ID : \n>>> ");
                id = sc.nextLine();
                System.out.print("Enter Patient Name : \n>>> ");
                name = sc.nextLine();
                System.out.print("Enter Patient mobile no : \n>>> ");
                mobileNo = sc.nextLine();
                System.out.print("Enter Patient covid status (Y-Positive | N - Negative) : \n>>> ");
                isCovidPositive = (sc.nextLine().charAt(0) == 'Y');
                CovidPatient temp = new CovidPatient();
                temp.setId(id);
                temp.setName(name);
                temp.setMobileNo(mobileNo);
                temp.setCovidPositive(isCovidPositive);
                covidPatientList.add(temp);

            }else if(selection == 2){
                String id, mobileNo;
                boolean isCovidPositive;
                System.out.print("Enter Patient ID : \n>>> ");
                id = sc.nextLine();
                System.out.print("Enter Patient Name : \n>>> ");
                String name = sc.nextLine();
                System.out.print("Enter Patient mobile no : \n>>> ");
                mobileNo = sc.nextLine();
                System.out.print("Enter Patient covid status (Y-Positive | N - Negative) : \n>>> ");
                isCovidPositive = (sc.nextLine().charAt(0) == 'Y');

                covidPatientList.add(new CovidPatient(id, name,mobileNo ,isCovidPositive));

            }else if(selection == 3){
                for(CovidPatient cp: covidPatientList){
                    cp.printLine();
                }
            }

        }
    }
}
