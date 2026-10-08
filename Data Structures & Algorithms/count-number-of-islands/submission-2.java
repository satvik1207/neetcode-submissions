class Solution 
{

    public int numIslands(char[][] grid) 
    {

        int islands = 0;

        for (int i = 0; i < grid.length; i++) 
        {
            for (int j = 0; j < grid[0].length; j++) 
            {

                if (grid[i][j] == '1') 
                {
                    islands++;

                    dfs(grid, i, j);
                }
            }
        }

        return islands;
    }

    public void dfs(char[][] grid, int row, int col) 
    {

        // Out of bounds
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) 
        {
            return;
        }

        // If it is water, stop
        if (grid[row][col] == '0') 
        {
            return;
        }

        // Mark land as visited
        grid[row][col] = '0';

        // Go up
        dfs(grid, row - 1, col);

        // Go down
        dfs(grid, row + 1, col);

        // Go left
        dfs(grid, row, col - 1);

        // Go right
        dfs(grid, row, col + 1);
    }
}