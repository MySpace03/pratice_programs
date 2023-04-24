import java.util.*;
import java.util.Queue;

public class billingsys{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the persons in the queue:");
        int n = sc.nextInt();
        System.out.print("Enter the per person iteams:");
        Queue <Integer> ppl = new LinkedList<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            ppl.add(num);
        }
        while(ppl.isEmpty()){
            int curr_ele = ppl.peek();
            if(curr_ele<=6){ 
                curr_ele = curr_ele - 6;
            }
        }
        sc.close();
    }
}