import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        String b = a.substring(numOne, numTwo + 1);
        System.out.println(b);
    }
}