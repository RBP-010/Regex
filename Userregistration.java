package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Userregistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = sc.nextLine();
        System.out.println("Enter your last name:");
        String lastName = sc.nextLine();
        if (!isValidName(firstName) || !isValidName(lastName)){
            System.out.println("Invalid name format. The name should have a capital first and last letter and at least three characters.");
            return;
        }
        System.out.println("Enter your email address:");
        String email = sc.nextLine();
        if (isValidEmail(email)){
            System.out.println("Invalid email format.");
            return;
        }
        System.out.println("Enter your mobile number:");
        String mobileNumber = sc.nextLine();
        if (isValidMobileNumber(mobileNumber)){
            System.out.println("Invalid mobile number format.");
            return;
        }
        // if all validation pass , display registration details
        System.out.println("Registration Successfully!");
        System.out.println("Name: " +firstName+ " " +lastName);
        System.out.println("Email: " +email);
        System.out.println("Mobile Number: " +mobileNumber);
    }
    // validate name(capital first and last ,minimum three characters)
    private static boolean isValidName(String name){
        return name.matches("[A-Z][a-zA-Z]{2,}");
    }
    private static boolean isValidEmail(String email){
        return email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9._]+\\.[a-zA-Z]");

    }
    private static boolean isValidMobileNumber(String mobileNumber){
        return mobileNumber.matches("[6-9]\\d[0-9]");
    }
}

