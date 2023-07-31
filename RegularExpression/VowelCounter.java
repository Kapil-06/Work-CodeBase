//Write a Java program that counts the number of vowels in a given string using regular expressions.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCounter {

    public static int countVowel(String input) {

        Pattern pattern = Pattern.compile("[AEIOUaeiou]+");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Java Programming";
        String str3 = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("The number of vowel in string1 is :" + countVowel(str1));
        System.out.println("The number of vowel in string2 is :" + countVowel(str2));
        System.out.println("The number of vowel in string3 is :" + countVowel(str3));
    }
}
