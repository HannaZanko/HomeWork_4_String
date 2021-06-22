import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("ВВедите строку 1: ");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("ВВедите строку 2: ");
        String str2 = new Scanner(System.in).nextLine();
        String[] arr1 = str1.toLowerCase().split("[\\\\\\\s.,!?:]+");
        String[] arr2 = str2.toLowerCase().split("[\\\\\\\s.,!?:]+");
        if (arr1.length == str2.length()) {
            for (int i = 0; i < arr1.length; i++) {
                char[] charArr1 = arr1[i].toCharArray();
                for (int j = 0; j < arr2.length; j++) {
                    char[] charArr2 = arr2[j].toCharArray();
                }

            }
        }
        else

        {
            System.out.println("No");
        }

    }

}
