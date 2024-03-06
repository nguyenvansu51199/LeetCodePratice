package Graph;

public class _200NumberofIslands {
  boolean[][] checked = new boolean[300][300];

  public void DFS(char[][] grid, int i, int j) {
    int soHang = grid.length;
    int soCot = grid[0].length;
    if (i < 0 || j < 0 || i >= soHang || j >= soCot) {
      return;
    }

    if (grid[i][j] == 0 || checked[i][j] == true) {
      return;
    }

    checked[i][j] = true;
    DFS(grid, i, j + 1);
    DFS(grid, i + 1, j);
    DFS(grid, i - 1, j);
    DFS(grid, i, j - 1);

  }

  public int numIslands(char[][] grid) {
    int n = grid.length;
    int m = grid[0].length;
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (grid[i][j] == '1' && checked[i][j] == false) {
          DFS(grid, i, j);
          count++;
        }
      }
    }

    return count;
  }
}
