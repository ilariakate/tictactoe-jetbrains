import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int counter = 0;
        int maxLength = 0;

        if (array.length == 1) {
            System.out.println(1);
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    if (array[i] > array[i - 1])
                        counter++;

                    if (counter > maxLength)
                        maxLength = counter;
                } else {
                    if (array[i] > array[i + 1]) {

                        if (counter > maxLength) {
                            counter++;
                            maxLength = counter;
                            counter = 0;
                        }

                    } else {
                        counter++;
                    }
                }
            }
            if(maxLength >1)
                System.out.println(maxLength);
            else
                System.out.println(1);
        }
    }
}