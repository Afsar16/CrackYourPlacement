public class Solution {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }

        int m = board.length;
        int n = board[0].length;

        // Direction vectors for 8 possible neighbors
        int[] directions = {-1, 0, 1};

        // Process each cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;

                // Count live neighbors
                for (int di : directions) {
                    for (int dj : directions) {
                        if (di == 0 && dj == 0) continue;
                        int ni = i + di;
                        int nj = j + dj;
                        if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                            if (board[ni][nj] == 1 || board[ni][nj] == 3) {
                                liveNeighbors++;
                            }
                        }
                    }
                }

                // Update the cell state based on live neighbors
                if (board[i][j] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        board[i][j] = 3; // Mark as live to dead
                    }
                } else {
                    if (liveNeighbors == 3) {
                        board[i][j] = 2; // Mark as dead to live
                    }
                }
            }
        }

        // Finalize the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 1; // Dead to live
                } else if (board[i][j] == 3) {
                    board[i][j] = 0; // Live to dead
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] board1 = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };

        sol.gameOfLife(board1);

        System.out.println("Next State of Board:");
        for (int[] row : board1) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
