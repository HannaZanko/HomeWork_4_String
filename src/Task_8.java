import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Введите название переменной: ");
        String peremennaya = new Scanner(System.in).nextLine();
        String upperLit;
        int index;
        char[] array = peremennaya.toCharArray();
        if (peremennaya.indexOf('_') != -1) {
            for (int i = 0; i < peremennaya.length() - 1; i++) {
                index = peremennaya.indexOf('_');
                if (index != -1) {
                    upperLit = peremennaya.substring(index + 1, index + 2).toUpperCase();
                    peremennaya = peremennaya.substring(0, index) + upperLit + peremennaya.substring(index + 2);
                }
            }
            System.out.println(peremennaya);
        } else {
            for (int i = 0; i < array.length; i++) {
                if (Character.isUpperCase(array[i])) {
                    upperLit = peremennaya.substring(i + 1);
                    array[i + 1] = Character.toLowerCase(array[i]);
                    array[i] = '_';
                    peremennaya = peremennaya.substring(0, i) + array[i] + array[i + 1] + upperLit;
                    array = peremennaya.toCharArray();
                }
            }
            System.out.println(peremennaya);
        }
    }
}

