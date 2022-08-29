import java.util.Arrays;
import java.util.Scanner;

public class tictactoe {
    static String[] board;
    static String turn;

    public static void displayBoard() {
        System.out.println(board[0] + " " + board[1] + " " + board[2] + " ");
        System.out.println(board[3] + " " + board[4] + " " + board[5] + " ");
        System.out.println(board[6] + " " + board[7] + " " + board[8] + " ");

    }

    public static String winnerCheck() {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[1] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("xxx")) {
                return "x";
            } else if (line.equals("ooo")) {
                return "o";
            }
        }
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                return "draw";

            }
        }
        System.out.println();
        System.out.println(turn + "'s turn");
        return null;
    }

    public static void main(String args[]) {
        String winner = null;
        turn = "x";
        int input;
        board = new String[9];
        System.out.println(" x wil go first:");
        for (int i = 0; i < 9; i++) {
            board[i] = Integer.toString(i + 1);
        }
        displayBoard();
        Scanner sc = new Scanner(System.in);
        while (winner == null) {
            input = sc.nextInt();
            if(input>9){
                System.out.println("Please enter valid position:");
                input = sc.nextInt();
            }
            if (board[input - 1].equals(Integer.toString(input))) {
                board[input - 1] = turn;

                if (turn == "x") {
                    turn = "o";
                } else {
                    turn = "x";
                }
                displayBoard();
                winner = winnerCheck();
            } else {
                System.out.println("Slot already taken, Enter another slot:");
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a Draw");
        } else {
            System.out.println("Congratulations winner is: " + winner);
        }
    }
}
