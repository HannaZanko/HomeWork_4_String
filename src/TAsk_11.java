import java.util.Scanner;

public class TAsk_11 {

    private static String word;

    public static void main(String[] args) {

        word = new Scanner(System.in).nextLine().toLowerCase();

        if (isRegexIn("[d-z]") || isRegexIn("(.)\\1\\1") || isRegexIn("[b][b]") || isRegexIn("([a-c][a-c])\\1\\1")
                || isRegexIn("([a-c][a-c][a-c])\\1\\1") || isRegexIn("([a-c][a-c][a-c][a-c])\\1\\1")) {
            System.out.println("Word is not Mumba-Umba");
        } else {
            System.out.println("Word is Mumba-Umba");
        }
    }

    private static boolean isRegexIn(String regex) {
        return !(word.replaceFirst(regex, "").length() == word.length());
    }

}
