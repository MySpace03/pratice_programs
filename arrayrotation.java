
import java.util.*;
public class arrayrotation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the rotation of the array bitwise value: ");
        sc.close();
    } 
    public static void swap(int[]arr,int a,int b,int d){
        int temp;
        for(int i=a;i<d;i++){
            temp = arr[a+i];
            arr[a+i] = arr[b+i];
            arr[b+i] = temp;
        }
    }
    public static void arrprint(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void rotate(){
        
    }
}