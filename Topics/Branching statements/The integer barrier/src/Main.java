import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0 || sum >= 1000) {
                break;
            }
            sum = sum + n;
        }
        if (sum < 1000) {
            System.out.println(sum);
        } else {
            sum = sum - 1000;
            System.out.println(sum);
        }
    }
}