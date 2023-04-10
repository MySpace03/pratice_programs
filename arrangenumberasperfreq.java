import java.util.*;
public class arrangenumberasperfreq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the Array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        //for (Map.Entry entry : map.entrySet()) {
          //  System.out.println(entry.getKey() + " " + entry.getValue());
        //}
        sc.close();
    }
}