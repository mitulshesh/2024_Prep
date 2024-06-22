package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class IslandsCount {

    public static void bfs(int r, int c, int[][] visited, char[][] grid){
            visited[r][c]=1;
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(r,c));

            //rows
            int n = grid.length;
            //columns
            int m = grid[0].length;

            while(!q.isEmpty()){
                int row = q.peek().first;
                int col = q.peek().second;
                q.remove();

                for(int delRow=-1;delRow <=1;delRow++){
                    for(int delCol =-1;delCol<=1;delCol++){
                        int nrow = row + delRow;
                        int ncol  = col + delCol;

                        // check if neighbour row and column is valid, and is an unvisited land
                        if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                                && grid[nrow][ncol] == '1' && visited[nrow][ncol] == 0) {
                            visited[nrow][ncol] = 1;
                            q.add(new Pair(nrow, ncol));
                        }
                    }
                }

            }
    }

    public static int countNoOfIslands(char[][] grid){

        //rows
        int n = grid.length;
        //columns
        int m = grid[0].length;

        int[][] visited = new int[n][m];
        int count = 0;

        for(int row= 0;row<n;row++){
            for(int col=0;col<m;col++){
                //check if its not visited and in grid it is land and not water
                if(visited[row][col] == 0 && grid[row][col] == '1'){
                    count++;
                    bfs(row,col,visited,grid);
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        char[][] grid =  {
                {'0', '1', '1', '1', '0', '0', '0'},
                {'0', '0', '1', '1', '0', '1', '0'}
        };

        IslandsCount obj = new IslandsCount();
        System.out.println(obj.countNoOfIslands(grid));
    }
}

class Pair{
    int first;
    int second;

    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }


}