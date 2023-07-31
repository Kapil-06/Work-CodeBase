import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHexColorCodeChecker {
    public static void main(String[] args) {

        String ColorCode = "#FF0000";
        boolean isValid = isValidHexColorCode(ColorCode);
        System.out.println("Input color code: " + ColorCode);
        System.out.println("Is it a valid hexadecimal color code? " + isValid);

    }

    public static boolean isValidHexColorCode(String code) {

        String regex = "^#([A-Fa-f0-9]{6})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);
        return matcher.matches();
    }
}
