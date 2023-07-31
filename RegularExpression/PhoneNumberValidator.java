// Write a Java program that validates if a given string is a valid phone number in a specific format (e.g., (123)456-7890).

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    public static boolean isValidPhoneNumber(String num) {
        Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\d{3}-\\d{4}");
        Matcher matcher = pattern.matcher(num);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String no1 = "(123)456-7890";
        String no2 = "123-456-7890";
        String no3 = "(123)456-78901";

        System.out.println("Phone Number 1: " + no1 + " - Is valid? " + isValidPhoneNumber(no1));
        System.out.println("Phone Number 2: " + no2 + " - Is valid? " + isValidPhoneNumber(no2));
        System.out.println("Phone Number 3: " + no3 + " - Is valid? " + isValidPhoneNumber(no3));
    }
}
