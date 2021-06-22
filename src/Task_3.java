import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] str1 = str.split(" ");
        System.out.println(Arrays.toString(str1));
        int l = 0;
        for (String s : str1) {
            l += s.length();
        }
        l /= str1.length;
        System.out.println(l);
    }
}
