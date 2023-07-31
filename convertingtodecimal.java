

public class convertingtodecimal{
    public static void main(String [] args){
        int num = 23;
        int n = num;
        int count = 0;
        // counting no. of digits for allocating space for array
        while(n>0){
            n = n/10;
            count++;
        }
        int [] arr = new int[count];
        int i = 0;
        while(num>0){
            int rem = num%2;
            num = num/10;
            arr[i] = rem;
            i++;
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}