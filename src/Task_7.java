import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        String str = new Scanner(System.in).nextLine();
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '0' || array[i] == '1' || array[i] == '3' || array[i] == '4' || array[i] == '5' || array[i] == '6' || array[i] == '7' || array[i] == '8' || array[i] == '9' || array[i] == '2') {
                array[i] = '_';
            } else {
                if (Character.isLowerCase(array[i])) {
                    array[i] = Character.toUpperCase(array[i]);
                } else {
                    array[i] = Character.toLowerCase(array[i]);
                }
            }
        }
        String str1 = new String(array);
        System.out.println(str1);
    }
}
