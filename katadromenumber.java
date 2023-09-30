import java.util.Scanner;

public class katadromenumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to check for the Katadrome numeber:");
        int n = sc.nextInt();
        System.out.println(katadome(n));
        sc.close();
    }
    public static boolean katadome(int n){
        while(n>0){
            int temp1 = n%10;
            n = n/10;
            int temp2 = n%10;
            if(temp1<temp2){
                return true;
            }
        }
        return false;
    } 
}