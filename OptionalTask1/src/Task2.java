import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Task2 {
        public static void main(String[] args) {
            Integer [] num = new Integer[4];
            try(Scanner scan = new Scanner(System.in)) {
                for (int i = 0; i < num.length; i++) {
                    System.out.println(" Введите " + (i + 1) + " число, пожалуйста: ");
                    num[i] = scan.nextInt();
                }
                sort(num, (o1, o2) -> Integer.compare(o2, o1));
                System.out.println(Arrays.toString(num));
            } catch (Exception e) {
                System.out.println("Ошибка!");
            }
        }
}
