import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();

        boolean checkLessthanAndGreaterthan = num1  < 10 && num1 > 0;
        System.out.println(checkLessthanAndGreaterthan);
    }
}