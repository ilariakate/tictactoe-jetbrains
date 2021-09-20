import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int noOfButterCups = scanner.nextInt();
        boolean weekendOrNot = scanner.nextBoolean();
        boolean weekday = noOfButterCups >= 10 && noOfButterCups <= 20 && !weekendOrNot;
        boolean weekend = noOfButterCups >= 15 && noOfButterCups <= 25 && weekendOrNot;
        boolean result = weekday || weekend;
        System.out.println(result);
    }
}