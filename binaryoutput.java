import java.util.Scanner;

public class binaryoutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = s.charAt(0)-'0';
        if(s.charAt(1)=='A'){
            ans = ans & s.charAt(2)-'0';
        }
        else if(s.charAt(1)=='B'){
            ans = ans | s.charAt(2)-'0';
        }
        else if(s.charAt(1)=='C'){
            ans = ans ^ s.charAt(2)-'0';
        }
        for(int i=4;i<s.length();i+=2){
            if(s.charAt(i-1)=='A'){
                ans = ans & s.charAt(i)-'0';
            }
            else if(s.charAt(i-1)=='B'){
                ans = ans | s.charAt(i)-'0';
            }
            else if(s.charAt(i-1)=='C'){
                ans = ans ^ s.charAt(i)-'0';
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
