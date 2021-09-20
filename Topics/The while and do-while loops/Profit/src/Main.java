import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double moneyInTheBank = scanner.nextInt();
        double percent = scanner.nextInt();
        double kMoney = scanner.nextInt();
        double convertedPercent = percent / 100;
        int noOfYears = 0;

        do {
            if (moneyInTheBank == kMoney) {
                break;
            }
            double profitPercent = moneyInTheBank * convertedPercent;
            moneyInTheBank += profitPercent;
            ++noOfYears;
        } while (moneyInTheBank < kMoney);
        System.out.println(noOfYears);
    }
}