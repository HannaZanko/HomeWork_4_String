import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите строку и символ: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String s = scanner.next();
        int n, m = 0, k = 0;
        for (int i = 0; i < str.length(); i++) {
            n = str.indexOf(s);
            m += n;
            System.out.println("index " + m);
            k++;
            m += 1;
            str = str.substring(n + 1);
        }
        System.out.println("количество " + k);
    }
}
