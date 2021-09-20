import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int elem;
        do {
            elem = scanner.nextInt();
            max = elem > max ? elem : max;
        } while (elem != 0);
        System.out.println(max);
    }
}