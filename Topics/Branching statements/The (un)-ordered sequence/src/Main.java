import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int previous = 0;
        boolean asc = false;
        boolean desc = false;
        while (scanner.hasNext()) {
            int current = scanner.nextInt();
            if (current == 0) {
                break;
            }
            if (previous != 0) {
                if (previous < current) {
                    asc = true;
                }
                if (previous > current) {
                    desc = true;
                }
            }

            previous = current;
        }
        if (asc && desc) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}