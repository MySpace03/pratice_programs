import java.util.*;

public class digonalsumdifference{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [][] input = new int[3][3];
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                input[i][j] = sc.nextInt();
            }
        }
        

        sc.close();
    }
}