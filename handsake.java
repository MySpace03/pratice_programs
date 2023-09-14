import java.util.Scanner;

public class handsake {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Person:");
        int n = sc.nextInt();
        int ans = (n*(n-1))/2;
        System.out.println((int)ans);
        sc.close();
    }
    
}
