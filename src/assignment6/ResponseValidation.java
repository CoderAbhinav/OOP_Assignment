package assignment6;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.System.exit;

public class ResponseValidation {

    public static boolean isInputValid(String input) throws UserDefinedException {
        // creating a regex pattern
        Pattern pattern = Pattern.compile("[a-zA-Z]+"); // regex for Characters only input
        // checking if input matches to regex
        if(pattern.matcher(input).matches()){
            return true;
        }
        // If not matches then throw error
        throw new UserDefinedException("Invalid Input");
    }

    public static boolean cityCheck(String city) throws UserDefinedException{
        if(city.equals("Pune") || city.equals("Mumbai") || city.equals("Chennai") || city.equals("Bangalore")){
            return true;
        }
        throw new UserDefinedException("Enter A Valid City Name");
    }

    public static boolean fourWheelCheck(String response) throws UserDefinedException{
        if(response.equals("Y") || response.equals("y")){
            return true;
        }
        throw new UserDefinedException("You Don't Own A 4 Wheeler");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cityName, fourWheelerResponse;
        boolean cityCheckVal = false, fourWheelerCheckVal = false;
        System.out.print("Enter The city Where you live\n>>> ");
        cityName = sc.nextLine().trim();
        try{
            isInputValid(cityName);

        } catch (UserDefinedException e) {
            e.printStackTrace();
            exit(0);
        }

        System.out.print("Do you have a four wheeler ?\n>>> ");
        fourWheelerResponse = sc.nextLine().trim().toLowerCase();
        try{
            isInputValid(fourWheelerResponse);
        } catch (UserDefinedException e) {
            e.printStackTrace();
            exit(0);
        }

        try {
            cityCheckVal = cityCheck(cityName);
        } catch (UserDefinedException e) {
            e.printStackTrace();
        }

        try {
            fourWheelerCheckVal = fourWheelCheck(fourWheelerResponse);
        } catch (UserDefinedException e) {
            e.printStackTrace();
        }

        if(fourWheelerCheckVal && cityCheckVal){
            System.out.print("You Live in " + cityName + ", & you own a four wheeler");
        }

    }
}
