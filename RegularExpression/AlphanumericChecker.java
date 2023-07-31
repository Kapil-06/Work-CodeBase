//Write a Java program that checks if a given string contains only alphanumeric characters.

public class AlphanumericChecker {

    public static boolean isAlphanumeric(String input) {
        return input.matches("[a-zA-Z0-9]+");
    }

    public static void main(String[] args) {

        String str1 = "HelloWorld123";
        String str2 = "Hello_World";
        String str4 = "!@#$%^&*";

        System.out.println("String " + str1 + " is alpha-numeric? " + isAlphanumeric(str1));
        System.out.println("String " + str2 + " is alpha-numeric? " + isAlphanumeric(str2));
        System.out.println("String " + str4 + " is alpha-numeric? " + isAlphanumeric(str4));
    }
}
