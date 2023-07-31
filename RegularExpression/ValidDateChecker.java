// Write a Java program that checks if a given string is a valid date in the format MM/DD/YYYY.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidDateChecker {
    public static void main(String[] args) {

        String inputDate = "12/15/2023";
        boolean isValid = isValidDate(inputDate);
        System.out.println("Input date: " + inputDate);
        System.out.println("Is it a valid date (MM/DD/YYYY)? " + isValid);

    }

    public static boolean isValidDate(String date) {
        String regex = "^(0[1-9]|1[0-2])/(0[1-9]|1[0-9]|2[0-9]|3[0-1])/\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
