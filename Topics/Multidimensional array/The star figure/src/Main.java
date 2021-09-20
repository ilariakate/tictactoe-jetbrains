import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] twoDimArr = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                if (i == j || i + j == n - 1 || i == n / 2 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}