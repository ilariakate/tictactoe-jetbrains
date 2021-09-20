import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] arrayElements = new int[arraySize];
        int max = 0;

        for (int i = 0; i < arraySize; i++) {
            arrayElements[i] = scanner.nextInt();
            if (arrayElements[i] > arrayElements[max]) {
                max = i;
                break;
            }
        }
        System.out.println(max);
    }
}