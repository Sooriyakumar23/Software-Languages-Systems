import java.util.Arrays;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {
        int number = 10;

        // 1. General
        for (int i=0; i<= number; i++) {
            System.out.println(i);
        }

        /************************************************************************************************************************************** */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 2. Enhanced
        for (int k: list) {
            System.out.println(k);
        }

        // 3. ForEach
        list.forEach((j) -> System.out.println(j));
    }
}