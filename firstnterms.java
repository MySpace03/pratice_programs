import java.util.Scanner;
public class firstnterms{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = sc.nextInt();
        int a = 6;
        int d = 6;
        System.out.print(a+" ");
        for(int i=0;i<n-1;i++){
            d = d+16;
            a = a + d;
            System.out.print(a+" ");
        }

        sc.close();
    }
}