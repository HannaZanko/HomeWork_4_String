import java.util.Arrays;
import java.util.Scanner;

/*Написать программу, проверяющую является ли одна
строка анаграммой для другой строки (строка может состоять
из нескольких слов и символов пунктуации). Пробелы и
пунктуация должны игнорироваться при анализе. Разница
в больших и маленьких буквах должна игнорироваться. Обе
строки должны вводиться с клавиатуры. Программа должна
выводить Yes, если строки являются анаграммой, и No –
иначе.
Пример анаграммы в стихах:
Строка 1 «Аз есмь строка, живу я, мерой остр».
Строка 2 «За семь морей ростка я вижу рост!» */

public class Task_9 {

    public static void main(String[] args) {
        System.out.println("ВВедите строку 1: ");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("ВВедите строку 2: ");
        String str2 = new Scanner(System.in).nextLine();
        String[] arr1 = str1.toLowerCase().split("[\\\\\\\s.,!?:]+");
        String[] arr2 = str2.toLowerCase().split("[\\\\\\\s.,!?:]+");

        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            char[] charArr1 = arr1[i].toCharArray();
            Arrays.sort(charArr1);
            for (int j = 0; j < arr2.length; j++) {
                char[] charArr2 = arr2[j].toCharArray();
                Arrays.sort(charArr2);
                if (Arrays.equals(charArr1, charArr2)) {
                    k++;
                }
            }
        }
        if (k == arr1.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
