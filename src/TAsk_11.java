import java.util.Locale;
import java.util.Scanner;

public class TAsk_11 {
    public static void main(String[] args) {

        System.out.println("Введите слово: ");
        String word = new Scanner(System.in).nextLine();
        char[] arrWord = word.toLowerCase().toCharArray();
        int k = 0;
        for (int i = 0; i < arrWord.length; i++) {
            if ((arrWord[i] == 'a' || arrWord[i] == 'b' || arrWord[i] == 'c') && (!word.contains("bb"))) {
                if (word.contains("[a-c]")) {

                }

            } else {
                System.out.println("Слово не существует");
                break;
            }
        }
        if (arrWord.length == k) {
            System.out.printf("Слово %s принадлежит языку Мумба-Юмба", word);

        }

    }
}
