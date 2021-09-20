import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long fact = 1;
        int i = 0;

        while (fact <= m) {
            i++;
            fact = fact * i;
        }
        System.out.println(i);


    }
}