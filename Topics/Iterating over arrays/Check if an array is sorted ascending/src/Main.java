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
        boolean asc = true;
        for (int i = 0; i < arraySize - 1; i++) {
            if (arrayElements[i] > arrayElements[i + 1]) {
                asc = false;
            }
        }
        System.out.println(asc);


    }
}