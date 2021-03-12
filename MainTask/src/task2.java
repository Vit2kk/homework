
public class task2<mirror> {
    public static void main(String[] args) {
        String str = "123456789";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Строка до реверса: " + str);
        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
    }
}