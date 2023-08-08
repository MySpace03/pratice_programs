import java.util.Scanner;

public class countnumingivenrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound of the range: ");
        int lowerBound = sc.nextInt();
        System.out.println("Enter the upper bound of the range: ");
        int upperBound = sc.nextInt();

        // Print the numbers in the range that are a combination of 1, 4, or 9
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 1 == 0 || i % 4 == 0 || i % 9 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }    
}
