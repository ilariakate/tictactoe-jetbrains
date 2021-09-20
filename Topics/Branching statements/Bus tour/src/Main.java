import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int noOfBridges = scanner.nextInt();
        boolean crashed = false;
        for (int i = 1; i <= noOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                crashed = true;
                break;
            }
        }
        if (!crashed) {
            System.out.println("Will not crash");
        }
    }
}
