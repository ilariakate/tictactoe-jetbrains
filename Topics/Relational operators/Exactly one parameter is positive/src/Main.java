import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean set1 = a > 0 && b <= 0 && c <= 0;
        boolean set2 = a <= 0 && b > 0 && c <= 0;
        boolean set3 = a <= 0 && b <= 0 && c > 0;
        boolean result = set1 || set2 || set3;
        System.out.println(result);
    }
}