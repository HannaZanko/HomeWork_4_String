import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String str = "";
        String str1;
        for (int i = 1; i < 1000; i++) {
            str1 = Integer.toString(i);
            if ((str.length() + str1.length()) < 1000) {
                str += Integer.toString(i);
            } else {
                break;
            }
        }
        System.out.println(str);
        char a = str.charAt(n - 1);
        System.out.println("Цифра на позиции n: " + a);
    }
}
