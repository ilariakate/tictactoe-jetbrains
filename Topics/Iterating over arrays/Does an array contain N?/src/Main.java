import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] arrayElements = new int[arraySize];
        boolean exists = false;

        for (int i = 0; i < arraySize; i++) {
            arrayElements[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int i = 0; i < arraySize; i++) {
            if (arrayElements[i] == n) {
                exists = true;
            }
        }
        System.out.println(exists);
    }
}