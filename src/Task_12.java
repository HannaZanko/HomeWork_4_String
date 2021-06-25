import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        String str = new Scanner(System.in).next();
        char[] charStr = str.toCharArray();
        int countSmile = 0;
        int j = 0;
       // int count = 0;
        while (j < charStr.length - 1) {
         //   count = j;
            if (charStr[j] == ':' || charStr[j] == ';') {
                j++;
                while (charStr[j] == '-') {
                    j++;
                }
                while (charStr[j] == ')' || charStr[j] == '(' || charStr[j] == ']' || charStr[j] == '[') {
                    j++;
                    if (charStr[j] != ')' && charStr[j] != '(' && charStr[j] != ']' && charStr[j] != '[') {
                        countSmile++;
                    }
                }


            }
            j++;
        }
        System.out.println(countSmile);
    }
}
