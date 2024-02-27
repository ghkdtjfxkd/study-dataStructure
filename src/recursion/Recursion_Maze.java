package recursion;

public class Recursion_Maze {

    private static int n = 8;
    private static int[][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0}
    };

    private static final int PATHWAY_COLOUR = 0; // white, 사람이 다닐 수 있는 통로
    private static final int WALL_COLOUR = 1; // blue, 벽
    private static final int BLOCKED_COLOUR = 2; // red , visited , 출구까지 경로상에 있지 않음이 밝혀진 cell
    private static final int PATH_COLOUR = 3; // green , visited , 출구로 가는 경로가 될 가능성이 있는 cell

    public static boolean findMazePath(int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= n) {
            // 미로의 범위 바깥
            // 코드상으로는 가능하지만 실제로는 가서는 안되는 위치이기에  x, y가 성립한다면 즉시 false
            return false;
        } else if (maze[x][y] != PATHWAY_COLOUR) {
            // visited 거나 wall 이거나
            return false;
        } else if (x == n - 1 && y == n - 1) {
            // 출구 인 경우
            maze[x][y] = PATH_COLOUR;
            return true;
        } else {

            maze[x][y] = PATH_COLOUR;
            // 방문했기 때문에 일단 녹색으로 칠한다.

            if (findMazePath(x - 1, y)
                    || findMazePath(x, y + 1)
                    || findMazePath(x + 1, y)
                    || findMazePath(x, y + 1))
            {
                return true;
            }
            maze[x][y] = BLOCKED_COLOUR;
            // dead end.
            // 여기까지 도달 했다는 것은 해당 위치에서 어떤 방향이든 출구까지 가는 경로가 없다는 뜻
            // 붉은 색으로 칠하고 false를 retrun;
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMazePath(0,0));
    }
}
