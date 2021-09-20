import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];

        for (int i = 1; i < arrayLength; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}