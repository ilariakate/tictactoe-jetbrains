import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        if (arraySize < 2) {
            return;
        }
        int[] intArr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            intArr[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 0; i < arraySize - 1; i++) {
            int current = intArr[i] * intArr[i + 1];
            if (max < current) {
                max = current;
            }
        }
        System.out.println(max);
    }
}