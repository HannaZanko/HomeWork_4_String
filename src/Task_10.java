import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        System.out.println("ВВедите строку: ");
        String str = new Scanner(System.in).nextLine();
        char[] charStr = str.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            for (int j = 0; j <= charStr.length; j++) {
                if (j >= (charStr.length - i)) {
                    System.out.print(str.substring(0, i + 1));
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < charStr.length; i++) {
            for (int j = 0; j <= charStr.length; j++) {
                if (j <= (charStr.length - i)) {
                    System.out.print(str.substring(i));
                    break;
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println("");
        }
    }
}



