import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int age = scanner.nextInt();
	String str = String.format("My age is ");

	System.out.println(str + age);

    }
}