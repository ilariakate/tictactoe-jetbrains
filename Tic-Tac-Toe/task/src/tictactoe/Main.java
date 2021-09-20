package tictactoe;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] charArray = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        printXO(charArray);
        boolean xCurrChar = true;
        String[] finishedValues = {"Draw", "X wins", "O wins"};
        while (!Arrays.asList(finishedValues).contains(getResult(charArray))) {
            getNewInputs(charArray, xCurrChar ? 'X' : 'O');
            xCurrChar = !xCurrChar;
            printXO(charArray);
        }
        System.out.println(getResult(charArray));
    }

    private static char[] convertTo1DArray(char[][] twoDimArray) {
        char[] oneDimArray = new char[twoDimArray.length * twoDimArray[0].length];
        int k = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                oneDimArray[k] = twoDimArray[i][j];
                k++;
            }
        }
        return oneDimArray;
    }

    private static String getResult(char[][] twoDimArray) {
        char[] oneDimArray = convertTo1DArray(twoDimArray);
        int xCount = 0;
        int oCount = 0;
        for (char c : oneDimArray) {
            if (c == 'X') {
                xCount++;
            } else if (c == 'O') {
                oCount++;
            }
        }

        if (!isXOBalanced(xCount, oCount) && !oInARow(oneDimArray) && !xInARow(oneDimArray) && (hasEmptyCells(oneDimArray))) {
            return "Game not finished";
        } else if (!isXOBalanced(xCount, oCount) && !oInARow(oneDimArray) && !xInARow(oneDimArray) && !hasEmptyCells(oneDimArray)) {
            return "Draw";
        } else if (!isXOBalanced(xCount, oCount) && xInARow(oneDimArray) && !oInARow(oneDimArray)) {
            return "X wins";
        } else if (!isXOBalanced(xCount, oCount) && oInARow(oneDimArray) && !xInARow(oneDimArray)) {
            return "O wins";
        } else {
            return "Impossible";
        }
    }

    private static char[][] getNewInputs(char[][] charArray, char input) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coordinates: ");
        String xCord = scanner.next();
        String yCord = scanner.next();
        if (!xCord.matches("\\d+") || !yCord.matches("\\d+")) {
            System.out.println("You should enter numbers!");
            return getNewInputs(charArray, input);
        }
        int x = Integer.parseInt(xCord);
        int y = Integer.parseInt(yCord);
        if (x < 1 || x > 3 || y < 1 || y > 3) {
            System.out.println("Coordinates should be from 1 to 3!");
            return getNewInputs(charArray, input);
        } else if (charArray[x - 1][y - 1] == 'X' || charArray[x - 1][y - 1] == 'O') {
            System.out.println("This cell is occupied! Choose another one!");
            return getNewInputs(charArray, input);
        }
        charArray[x - 1][y - 1] = input;
        return charArray;
    }

    private static void printXO(char[][] charArray) {
        System.out.println("---------");
        System.out.println("| " + charArray[0][0] + " " + charArray[0][1] + " " + charArray[0][2] + " |");
        System.out.println("| " + charArray[1][0] + " " + charArray[1][1] + " " + charArray[1][2] + " |");
        System.out.println("| " + charArray[2][0] + " " + charArray[2][1] + " " + charArray[2][2] + " |");
        System.out.println("---------");
    }


    private static boolean oInARow(char[] charArray) {
        return (charArray[0] == 'O' && charArray[0] == charArray[1] && charArray[0] == charArray[2] ||
                charArray[3] == 'O' && charArray[3] == charArray[4] && charArray[3] == charArray[5] ||
                charArray[6] == 'O' && charArray[6] == charArray[7] && charArray[6] == charArray[8] ||
                charArray[0] == 'O' && charArray[0] == charArray[3] && charArray[0] == charArray[6] ||
                charArray[1] == 'O' && charArray[1] == charArray[4] && charArray[1] == charArray[7] ||
                charArray[2] == 'O' && charArray[2] == charArray[5] && charArray[2] == charArray[8] ||
                charArray[0] == 'O' && charArray[0] == charArray[4] && charArray[0] == charArray[8] ||
                charArray[2] == 'O' && charArray[2] == charArray[4] && charArray[2] == charArray[6]);
    }

    private static boolean xInARow(char[] charArray) {
        return (charArray[0] == 'X' && charArray[0] == charArray[1] && charArray[0] == charArray[2] ||
                charArray[3] == 'X' && charArray[3] == charArray[4] && charArray[3] == charArray[5] ||
                charArray[6] == 'X' && charArray[6] == charArray[7] && charArray[6] == charArray[8] ||
                charArray[0] == 'X' && charArray[0] == charArray[3] && charArray[0] == charArray[6] ||
                charArray[1] == 'X' && charArray[1] == charArray[4] && charArray[1] == charArray[7] ||
                charArray[2] == 'X' && charArray[2] == charArray[5] && charArray[2] == charArray[8] ||
                charArray[0] == 'X' && charArray[0] == charArray[4] && charArray[0] == charArray[8] ||
                charArray[2] == 'X' && charArray[2] == charArray[4] && charArray[2] == charArray[6]);
    }

    private static boolean hasEmptyCells(char[] charArray) {
        return ((charArray[0] == '_' || charArray[1] == '_' || charArray[2] == '_' || charArray[3] == '_'
                || charArray[4] == '_' || charArray[5] == '_' || charArray[6] == '_' || charArray[7] == '_'
                || charArray[8] == '_') || (charArray[0] == ' ' || charArray[1] == ' ' || charArray[2] == ' ' || charArray[3] == ' '
                || charArray[4] == ' ' || charArray[5] == ' ' || charArray[6] == ' ' || charArray[7] == ' '
                || charArray[8] == ' '));
    }

    private static boolean isXOBalanced(int xCount, int oCount) {
        return xCount > oCount + 1 || oCount > xCount + 1;
    }

}

