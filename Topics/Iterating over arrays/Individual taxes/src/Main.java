import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int noOfCompanies = scanner.nextInt();
        int[] yearlyIncome = new int[noOfCompanies];
        int[] individualTaxes = new int[noOfCompanies];

        for (int i = 1; i < noOfCompanies - 1; i++) {
            yearlyIncome[i] = scanner.nextInt();
        }

        for (int i = 1; i < noOfCompanies - 1; i++) {
            individualTaxes[i] = scanner.nextInt();
        }

        int[] tax = new int[noOfCompanies];
        int maxTax = 0;
        for (int i = 1; i < noOfCompanies - 1; i++) {
            tax[i] = (individualTaxes[i] / 100) * yearlyIncome[i];
            if (tax[i] > maxTax) {
                maxTax = i;
            }
        }

        System.out.println(maxTax);

    }
}