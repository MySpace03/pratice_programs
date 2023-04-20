import java.util.*;
public class arraytarget {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int [] nums  = new int[n];
        System.out.print("Enter the Elements of array: ");
        for(int x=0;x<n;x++){
            nums[x] = sc.nextInt();
        }
        System.out.print("Enter the value of the Target: ");
        int target = sc.nextInt();
        int i = 0;
        int j = 1;
        while(j<nums.length){
            if(nums[i]+nums[j]==target){
                System.out.println(i+" "+ j);
            }
            else{
                i = j;
            }
            j++;
        }
        sc.close();
    }
}
