public class SimpleGrid {

    public static void main(String[] args) {

        int[][] grid = {
            { 6, 14,  6, 16,  8, 16,  4, 12 },
            {18, 16, 16, 20, 16,  4,  4, 20 },
            { 6, 12, 14, 12, 18, 16, 10, 18 },
            {12, 12, 14, 12, 12, 18, 12, 12 },
            { 4, 20, 14, 10, 12, 12, 18, 12 },
            {12,  8, 18, 10, 12,  4,  4, 12 },
            { 6,  8, 18, 18,  8, 12, 12,  6 },
            { 8, 14, 14, 20, 14,  4, 18,  8 }
        };
        int n = 8;
        int highlight = 8;
        printExactGrid(grid, n, highlight);
        System.out.println("\nNumber 8 appeared 6 time(s)");
    }

    private static void printExactGrid(int[][] grid, int n, int highlight)
        System.out.print("   ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%02d ", j);
        }
        System.out.println();
        System.out.print("  +");
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
            System.out.print("  +");
            for (int j = 0; j < n; j++) System.out.print("---+");
            System.out.println();
        }
    }
}
