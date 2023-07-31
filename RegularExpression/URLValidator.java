//Write a Java program that checks if a given string is a valid URL.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLValidator {

    public static boolean isValidURL(String input) {
        Pattern pattern = Pattern.compile("^(https?|ftp)://([\\w.-]+)(:\\d+)?(/[\\w./?-]*)?$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String url1 = "https://localhost:8080/www.example.com";
        String url2 = "www.example.com";
        String url3 = "not_a_url";

        System.out.println("URL 1: " + url1 + " - Is valid? " + isValidURL(url1));
        System.out.println("URL 2: " + url2 + " - Is valid? " + isValidURL(url2));
        System.out.println("URL 3: " + url3 + " - Is valid? " + isValidURL(url3));
    }
}
