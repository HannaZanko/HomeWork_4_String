import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.SplittableRandom;

public class Task_6 {
    public static void main(String[] args) {

//        int c = 0;
//        for (int i = 0; i <= 99999; i++) {
//            if (("" + i).matches(".*(4|13).*")) {
//                c++;
//            }
//        }
//        System.out.println(c);

        int b = 0;
        for (int i = 1; i <= 99999; i++) {
            String s = String.valueOf(i);
            if (s.indexOf('4') != -1 || s.indexOf('1') != -1 && (s.indexOf('1') + 1 == s.indexOf('3'))) {
                b++;
            }
        }
        System.out.println("Нужно исключить " + b + " номеров");
    }
}

