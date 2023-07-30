import java.util.*;
public class changethenumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int s = sc.nextInt();
        int ans = 0;
        int i = 0;
        if(s>1000000 || s<0){
            System.out.println("Wrong Input");
        }
        else{
            while(s>0){
            int temp = s%10;
            int temp2 = (int)(Math.pow(10,i++));
            ans = ans + (9-temp)*temp2; 
            s = s/10;
            }
            System.out.println(ans);
        }   
        sc.close();
    }
}