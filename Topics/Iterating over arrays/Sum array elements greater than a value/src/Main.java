import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        int sum = 0;

        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int elem : arr) {
            if (elem > n) {
                sum += elem;
            }
        }

        System.out.println(sum);
    }
}