import java.util.*;

public class fillmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rows for matrix: ");
        int m = sc.nextInt();
        System.out.print("Enter the Value of column for matrix: ");
        int n = sc.nextInt();
        System.out.print("Enter the intial value for matrix: ");
        int incr = sc.nextInt();
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = incr;
                incr++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }    
}