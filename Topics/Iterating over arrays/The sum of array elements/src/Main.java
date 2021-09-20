import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] arrayElements = new int[arrayLength];
        int sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            arrayElements[i] = scanner.nextInt();
            sum = sum + arrayElements[i];
        }
        System.out.println(sum);
    }
}