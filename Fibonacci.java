import java.util.Scanner;

public class Fibonacci {
   public void Fibonacci(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n :");
        int n = scanner.nextInt();
        int prev1 = 0;
        int prev2 = 1;
        int sum;
        System.out.print("Fibonacci : ");
        for (int i = 0; i < n; i++) {
            sum = prev1 + prev2;
            System.out.print( sum +",");
            prev1 = prev2;
            prev2 = sum;
        }
       
   }
   public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();
       fibonacci.Fibonacci();
   }
}
