import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > -15 && n < 13 || n > 14 && n < 17 || n > 18) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}