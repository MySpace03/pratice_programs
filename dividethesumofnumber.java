import java.util.*;

public class dividethesumofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while(n>0){
            int temp = n%10;
            n = n/10;
            sum += temp; 
        }
        if(num%sum==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();
    }    
}
