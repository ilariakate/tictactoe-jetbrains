import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int givenNumber = scanner.nextInt();
        int tens = (givenNumber / 10) % 10;
        System.out.println(tens);

    }
}