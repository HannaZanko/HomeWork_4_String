import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        String str = new Scanner(System.in).next();
        str = str.replaceAll("[;:]-*[()\\[\\]]+}", "$");
        int countSmile = 0;
        for (char c : str.toCharArray()) {
            if (c == '$') {
                countSmile++;
            }
        }
        System.out.println(countSmile);
    }
}
