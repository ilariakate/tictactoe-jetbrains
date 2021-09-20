import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int counter = 0;

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < arraySize - 1; i++) {
            if (array[i] - 1 == array[i - 1] && array[i] + 1 == array[i + 1]) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}