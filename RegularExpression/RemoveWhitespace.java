//Write a Java program that removes all whitespace characters from a given string using regular expressions.

public class RemoveWhitespace {
    public static void main(String[] args) {

        String str = "Hello   World!\t\tWelcome to    Java.";

        String result = removeWhiteSpace(str);
        System.out.println("Original String: " + str);
        System.out.println("String with whitespace removed: " + result);
    }

    public static String removeWhiteSpace(String str2) {

        return str2.replaceAll("\\s", "");
    }
}
