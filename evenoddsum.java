import java.util.*;
public class evenoddsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int n = sc.nextInt();
        int [] arr_e = new int[n];
        int [] arr_o = new int[n];
        System.out.print("Enter the elements of Array: ");
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr_e[i] = sc.nextInt();
            }
            else{
                arr_o[i] = sc.nextInt();
            }
        }
        Arrays.sort(arr_e);
        Arrays.sort(arr_o);
        System.out.println(arr_o[n-2]+arr_e[n-2]);
        sc.close();
    }
}