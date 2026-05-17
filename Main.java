import java.util.*;

public class Main {

    static int rows, cols;

    static int countneighbour(int grid[][],int r,int c)
    {
        int cc = 0;
        if(grid[r-1][c-1]==1)
            cc++;
        if(grid[r-1][c]==1)
            cc++;
        if(grid[r-1][c+1]==1)
            cc++;
        if(grid[r][c-1]==1)
            cc++;
        if(grid[r][c+1]==1)
            cc++;
        if(grid[r+1][c-1]==1)
            cc++;
        if(grid[r+1][c]==1)
            cc++;
        if(grid[r+1][c+1]==1)
            cc++;
        return cc;
    }

    static void print(int grid[][])
    {
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                if(grid[i][j] == 1)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        rows = in.nextInt();
        System.out.println("Enter number of cols: ");
        cols = in.nextInt();

        int grid[][] = new int[rows][cols];
        System.out.println("Enter number of alive cells: ");
        int alive = in.nextInt();

        System.out.println("Enter coordinated of alive cells ");
        for (int i = 0; i < alive; i++) {
            System.out.println("Row: ");
            int r = in.nextInt();
            System.out.println("col: ");
            int c = in.nextInt();
            grid[r][c] = 1;
        }
        System.out.println("Enter number of iterations: ");
        int ii = in.nextInt();

        for(int i = 1;i<ii;i++)
        {
            System.out.println("Iteration: " + i);
            Thread.sleep(2000);
        }
        in.close();
    }
}
