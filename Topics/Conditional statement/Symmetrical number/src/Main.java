import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();

        char a = num.charAt(0);
        char b = num.charAt(1);
        char c = num.charAt(2);
        char d = num.charAt(3);


        if (a == d && b == c) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

    }
}