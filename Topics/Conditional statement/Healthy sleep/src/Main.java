import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int aHours = scanner.nextInt();
        int bHours = scanner.nextInt();
        int hHours = scanner.nextInt();

        if (aHours <= hHours && bHours >= hHours) {
            System.out.println("Normal");
        } else if (hHours >= bHours) {
            System.out.println("Excess");
        } else if (hHours <= aHours) {
            System.out.println("Deficiency");
        }
    }
}