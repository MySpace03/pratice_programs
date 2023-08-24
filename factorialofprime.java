import java.util.*;
public class factorialofprime{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        boolean [] bool = new boolean[n];
        for(int i=0;i<n;i++){
            bool[i] = true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(bool[i]==true){
                for(int j=(i*i);j<n;j+=i){
                    bool[i] = false;
                }
            }
        }
        int [] arr = new int[n];
        for(int i=0;i<bool.length;i++){
            if(bool[i]==true){
                arr[i] = i;
            }
        }
        int[] fact_num = new int[n];
        for(int i=0;i<arr.length;i++){
            int fact = 1;
            for(int j=1;j<arr[i]+1;j++){
                fact = fact*j;
            }
            fact_num[i] = fact; 
        }
        printarray(arr);
        sc.close();
    }
    public static void printarray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}