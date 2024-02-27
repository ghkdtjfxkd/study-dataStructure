package recursion;

public class Recursion_Counting_Cells_In_A_Blob {

    private static int[][] grid = {
            {1,0,0,0,0,0,0,1},
            {0,1,1,0,0,1,0,0},
            {1,1,0,0,1,0,1,0},
            {0,0,0,0,0,1,0,0},
            {0,1,0,1,0,1,0,0},
            {0,1,0,1,0,1,0,0},
            {1,0,0,0,1,0,0,1},
            {0,1,1,0,0,1,1,1},
    };

    private static final int n = grid.length;
    private static final int BACKGROUND_COLOR = 0;
    private static final int IMAGE_COLOR = 1;
    private static final int ALREADY_COUNTED = 2;

    public static int countCells(int x, int y){

        if(x < 0 || x >= n || y<0 || y>=n)
            // 입력 된 좌표 x, y 의 유효성을 먼저 체크한다.
            return 0;
        else if (grid[x][y] != IMAGE_COLOR)
            return 0;
        else {
            // 상하좌우 및 대각선의 경우도 포함
            grid[x][y] = ALREADY_COUNTED;
            return 1 + countCells(x-1,y+1) + countCells(x, y+1)
                    + countCells(x+1,y+1) + countCells(x-1, y)
                    + countCells(x+1,y) + countCells(x-1, y-1)
                    + countCells(x,y-1) + countCells(x+1, y-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(countCells(3,5));
    }
}
