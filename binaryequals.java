import java.util.*;
public class binaryequals {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First binary number:");
        String s1 = sc.next();
        System.out.print("Enter the Second binary number:");
        String s2 = sc.next();
        if(s1.length()==s2.length()){
            int c_1 = 0;
            int c_1s = 0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)=='1'){
                    c_1 +=1;
                }
                if(s2.charAt(i)=='1'){
                    c_1s +=1;
                }
            }
            if(c_1==c_1s){
                System.out.println("Possibility of Being Equal");
            }
            else{
                System.out.println("No Possibility of Being Equal");
            }
        }
        else{
            System.out.println("The gievn Input does not have Equal length");
        }
        sc.close();
    }    
}
