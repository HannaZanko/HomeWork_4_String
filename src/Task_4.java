
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        String str = new Scanner(System.in).nextLine();
        String[] str1 = str.toLowerCase(Locale.ROOT).split(" ");
        char[] consonants = new char[]{'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        for (int i = 0; i < str1.length; i++) {
            char[] str2 = str1[i].toCharArray();
            for (int j = 0; j < consonants.length; j++) {
                if ((str2[0] == 'a' || str2[0] == 'i' || str2[0] == 'e' || str2[0] == 'y' || str2[0] == 'u' || str2[0] == 'o') && str2[str2.length - 1] == consonants[j]) {
                    System.out.print(str1[i] + "\t\t");
                    break;
                }

            }
        }
    }
}
