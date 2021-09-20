import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String str = scanner.next();

        System.out.println(str.toUpperCase().startsWith("J"));
    }
}