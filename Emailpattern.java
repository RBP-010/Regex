package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Emailpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your email address:");
        String email = sc.nextLine();
        if (isValidEmail(email)){
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }
    private static boolean isValidEmail(String email){
        String pattern = "^[a-zA-Z0-9._]+@[a-zA-Z0-9._]+\\.[a-zA-Z]{2,}$";
        Pattern  regex = Pattern.compile(pattern);
        return regex.matcher(email).matches();
    }
}
