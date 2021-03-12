import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            String longNum = "", shortNum = line;
            for (String s : line.split(" ")) {
                if (s.length() > longNum.length()) longNum = s;
                if (s.length() < shortNum.length()) shortNum = s;
            }
            System.out.println("Самое длинное число: '" + longNum + "'");
            System.out.println("Длина: " + longNum.length());
            System.out.println("Самое короткое число: '" + shortNum + "'");
            System.out.println("Длина: " + shortNum.length());
        }
    }


