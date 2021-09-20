import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String replaceString1 = str1.replaceAll("\\s+", "");
        String replaceString2 = str2.replaceAll("\\s+", "");

        System.out.println(replaceString1.equals(replaceString2));
    }
}