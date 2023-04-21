import java.util.*;
public class automorphicnum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int squre = n*n;
        if(squre%10==n){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an automorphic number");
        }

        sc.close();
    }    
}
