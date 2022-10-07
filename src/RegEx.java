import java.util.regex.Pattern;

public class RegEx {
    public static boolean isCorrectIP(String checkingString) {
        Pattern pattern = Pattern.compile(
                "((2[1-4]\\d|25[1-5]|\\d|\\d\\d|1\\d\\d)\\.){3}" +
                        "(\\d|\\d\\d|1\\d\\d|21-4\\d|251-5)");
        return pattern.matcher(checkingString).matches();
    }

    public static boolean isCorrectGUID(String checkingString) {
        Pattern pattern = Pattern.compile(
                "([0-9a-fA-F]{8}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{12}|" +
                        "\\{[0-9a-fA-F]{8}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{12}\\})");
        return pattern.matcher(checkingString).matches();
    }
}