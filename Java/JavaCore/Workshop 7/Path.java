import java.util.LinkedList;
import java.util.Queue;

// import java.util.LinkedList;
// import java.util.Queue;

// /**
//  * Реализовать волновой алгоритм
//  */
public class Path {

    public static void main(String[] args) {
        // int[][] updateMap;
        updateMatrix updateMap = new updateMatrix(null);
    }
}

class getMap {
    int[][] map;

    public getMap() {
        int[][] map = {
                { 1, 0, 1, 0, 1 },
                { 0, 1, 1, 0, 0 },
                { 0, 0, 1, 1, 0 },
                { 1, 1, 0, 1, 0 },
                { 0, 1, 1, 1, 0 }
        };
    }
}

class updateMatrix {

    getMap map = new getMap();
    public updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[] { i, j });
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[] dirs = { -1, 0, 1, 0, -1 };

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int i = 0; i < 4; i++) {
                int r = cell[0] + dirs[i];
                int c = cell[1] + dirs[i + 1];
                if (r < 0 || r >= m || c < 0 || c >= n ||
                        matrix[r][c] <= matrix[cell[0]][cell[1]] + 1)
                    continue;
                queue.add(new int[] { r, c });
                matrix[r][c] = matrix[cell[0]][cell[1]] + 1;
            }
        }

    }
}