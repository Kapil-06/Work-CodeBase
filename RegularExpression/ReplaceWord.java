//Write a Java program that replaces all occurrences of a specific word in a given string with another word using regular expressions.

public class ReplaceWord {
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog.";
        String wordToReplace = "fox";
        String replacementWord = "cat";

        String result = str.replaceAll(wordToReplace, replacementWord);

        System.out.println(result);
    }
}
