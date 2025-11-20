public class ExampleBExactOutput {
    public static void main(String[] args) {

        int[][] grid = {
            {20,  4, 16, 14, 18, 20},
            {10,  6,  8,  6,  2, 10},
            {10, 14, 12, 10,  4, 16},
            { 2,  2,  4, 20, 16, 10},
            {10,  2, 20, 18,  2,  4},
            { 4, 18,  2,  6, 16,  8}
        };
        int n = 6;
        int highlight = 10;
        System.out.println("Step 2:\n");
        System.out.println("[Enter a number to highlight (even number 2–20): 10");
        System.out.println("Array with 10 highlighted:");
        printGrid(grid, n, highlight);
        System.out.println("\nNumber 10 appeared 6 time(s)");
    }
    private static void printGrid(int[][] grid, int n, int highlight) {
        System.out.print("     ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%02d  ", j);
        }
        System.out.println();
        System.out.print("   +");
        for (int j = 0; j < n; j++) System.out.print("---+");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%02d |", i);
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == highlight) {
                    System.out.printf("[%2d]|", grid[i][j]);
                } else {
                    System.out.printf(" %2d |", grid[i][j]);
                }
            }
            System.out.println();
            System.out.print("   +");
            for (int j = 0; j < n; j++) System.out.print("---+");
            System.out.println();
        }
    }
}
