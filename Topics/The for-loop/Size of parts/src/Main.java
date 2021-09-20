import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            if (temp == 0) {
                a++;
            } else if (temp == 1) {
                b++;
            } else if (temp == -1) {
                c++;
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}