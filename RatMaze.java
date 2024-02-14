import java.util.Scanner;

public class RatMaze {
    static int sol[][];
    static int cont = 0;

    static boolean mazeSolve(int maze[][], int x, int y) {
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isPassible(maze, x, y)) {
            sol[x][y] = 1;

            if (mazeSolve(maze, x, y + 1))
                return true;

            if (mazeSolve(maze, x + 1, y))
                return true;

            sol[x][y] = 0;
        }
        return false;
    }

    static boolean isPassible(int maze[][], int x, int y) {
        cont++;
        return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the maze:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns in the maze:");
        int cols = scanner.nextInt();

        int maze[][] = new int[rows][cols];
        sol = new int[rows][cols];

        System.out.println("Enter the maze values (0 or 1):");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        if (mazeSolve(maze, 0, 0))
            for (int i = 0; i < sol.length; i++) {
                for (int j = 0; j < sol[0].length; j++)
                    System.out.print(" " + sol[i][j] + " ");
                System.out.println();
            }
        else
            System.out.println("Solution is not possible");
    }
}
