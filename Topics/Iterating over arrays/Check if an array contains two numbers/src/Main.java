import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] arrayElements = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrayElements[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean numberOccurred = true;
        for (int i = 1; i < arraySize; i++) {
            if (arrayElements[i - 1] == n && arrayElements[i] == m ||
                    arrayElements[i - 1] == m && arrayElements[i] == n) {
                numberOccurred = false;
            }
        }
        System.out.println(!numberOccurred);
    }
}