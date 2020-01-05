package com.aneonoir.dsalgo.practise.dynamicprogramming;

/**
 * link:    https://leetcode.com/problems/minimum-path-sum/
 *
 * TODO: to to memoization , I do see overlapping,
 *
 * I had a lot of struggle thinking this one, a must practise, for this type of questions.
 *
 *
 * Dude : all struggle, I need to improve this area.
 * @see MinPathSum for iterative approach.
 *
 * /**
 * [[1,4,8,6,2,2,1,7],[4,7,3,1,4,5,5,1],[8,8,2,1,1,8,0,1],[8,9,2,9,8,0,8,9],[5,7,5,7,1,8,5,5],[7,0,9,4,5,6,5,6],[4,9,9,7,9,1,9,0]] failed test case;
 */
public class MinimumPathSum {

    public static void main(String[] args) {
        MinimumPathSum minimumPathSum = new MinimumPathSum();


        int as[][] = new int[][]{
                {1, 4,2},
               };

        int sd[][]=new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};

        int sum = minimumPathSum.minPathSum(sd);

        System.out.println(sum);

    }
    public int minPathSum(int [][]grid){
        return  minPathSum(grid,0,0,grid.length-1, grid[0].length-1);

    }
    public int minPathSum(int[][] grid,int m, int n ,int rowMax,int colMax) {
        if(m>rowMax || n>colMax){
            return -1;
        }else if(m==rowMax && n==colMax){
            return grid[m][n];
        }else{

            int right = minPathSum(grid, m, n + 1, rowMax, colMax);
            int down=minPathSum(grid,m+1,n,rowMax,colMax);
            int res=0;
            if(down==-1 || right==-1){
                grid[m][n]= grid[m][n]+ (down==-1? right: down);
            }
            if(down!=-1 && right!=-1) grid[m][n]=grid[m][n]+Math.min(down, right);
            return grid[m][n];
        }
    }
}