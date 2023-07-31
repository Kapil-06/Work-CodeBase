//Write a Java program that extracts all email addresses from a given text using regular expressions.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
    public static void main(String[] args) {

        String text = "Please contact support@example.com for any assistance. "
                + "You can also reach out to contact@domain.com for further information.";

        String regex = "\\b[A-Za-z0-9._%-+]+@[A-Za-z0-9._]+\\.[A-Za-z]{2,}\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String mail = matcher.group();
            System.out.println(mail);
        }
    }
}
