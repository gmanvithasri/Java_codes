import java.util.Scanner;

public class KnightTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the chessboard size:");
        int chessBoardSize = scanner.nextInt();

        KnightTour knightTour = new KnightTour(chessBoardSize);
        knightTour.solveKnightTourProblem();
    }

    int BOARD_SIZE;
    int[][] visited;
    int[] xMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    int[] yMoves = {1, 2, 2, 1, -1, -2, -2, -1};

    public KnightTour(int chessBoardSize) {
        this.BOARD_SIZE = chessBoardSize;
        this.visited = new int[BOARD_SIZE][BOARD_SIZE];
        this.initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++)
            for (int j = 0; j < BOARD_SIZE; j++)
                this.visited[i][j] = Integer.MIN_VALUE;
    }

    public void printSolution() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(visited[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void solveKnightTourProblem() {
        System.out.println("Starting Knight Tour from (0, 0)...");
        visited[0][0] = 0;
        if (solveProblem(1, 0, 0)) {
            System.out.println("Knight Tour Solution:");
            printSolution();
        } else {
            System.out.println("No feasible solution found...");
        }
    }

    public boolean solveProblem(int moveCount, int x, int y) {
        if (moveCount == BOARD_SIZE * BOARD_SIZE) {
            return true;
        }

        for (int i = 0; i < xMoves.length; ++i) {
            int nextX = x + xMoves[i];
            int nextY = y + yMoves[i];

            if (isValidMove(nextX, nextY) && visited[nextX][nextY] == Integer.MIN_VALUE) {
                visited[nextX][nextY] = moveCount;
                if (solveProblem(moveCount + 1, nextX, nextY)) {
                    return true;
                }
                visited[nextX][nextY] = Integer.MIN_VALUE; // BACKTRACK
            }
        }
        return false;
    }

    public boolean isValidMove(int x, int y) {
        return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
    }
}
