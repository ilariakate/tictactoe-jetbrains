import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] twoDimArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                int k = j - i;
                twoDimArr[i][j] = Math.abs(k);
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}