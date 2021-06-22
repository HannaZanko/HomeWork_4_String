import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        String str = new Scanner(System.in).nextLine();
        String[] str1 = str.replace(":", "").toLowerCase(Locale.ROOT).split(" ");
        System.out.println(Arrays.toString(str1));
        int k = 0;
        for (int i = 0; i < str1.length; i++) {
            char[] str2 = str1[i].toCharArray();
            if (str2.length % 2 == 0) {
                k++;
            }
        }
        System.out.println(k);
    }
}
