import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 30_000) {
            int num = 0;
            int max = 0;

            for (int i = 0; i < n; i++) {
                num = scanner.nextInt();
                if (num % 4 == 0 && num <= 1000 && num > max) {
                    max = num;
                }
            }
            System.out.println(max);
        }
        scanner.close();
    }
}