public class Ex3 {

    public static void main(String[] args) {
        System.out.println("START");
        String[][] grid = new String[10][10];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = "- ";
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

    }
}
