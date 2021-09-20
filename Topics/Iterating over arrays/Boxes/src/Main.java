import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];

        for (int i = 0; i < box1.length; i++) {
            box1[i] = scanner.nextInt();
        }
        Arrays.sort(box1);
        for (int i = 0; i < box2.length; i++) {
            box2[i] = scanner.nextInt();
        }
        Arrays.sort(box2);
        int a = 0;
        int b = 0;

        for (int i = 0; i < box1.length; i++) {
            if (box1[i] > box2[i]) {
                a++;
            } else if (box2[i] > box1[i]) {
                b++;
            }
        }
        if (a == 3) {
            System.out.println("Box 1 > Box 2");
        } else if (b == 3) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}