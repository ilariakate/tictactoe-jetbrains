import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            if (elem > max && elem % 4 == 0) {
                max = elem;
            }
        }
        System.out.println(max);
    }
}