import java.util.Arrays;

public class SplitStringWithRegex {

    public static void main(String[] args) {
        String inputString = "Hello, world! Welcome to Java programming.";
        String[] wordsArray = splitStringIntoWords(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Array of words: " + Arrays.toString(wordsArray));
    }

    public static String[] splitStringIntoWords(String input) {
        // Use the regular expression pattern \W+ to split the string into words.
        // \W+ matches any non-word character (i.e., anything other than letters,
        // digits, and underscores).
        return input.split("\\W+");
    }
}
