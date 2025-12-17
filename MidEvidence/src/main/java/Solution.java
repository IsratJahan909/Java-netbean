import java.util.Scanner;
//Solution 01
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter numbers : ");

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            if (input > 0) {
                sum += input;
                System.out.println("Current sum: " + sum); 
        }

       

        
    }
         System.out.println("Final sum: " + sum);
scanner.close();
    }
}
