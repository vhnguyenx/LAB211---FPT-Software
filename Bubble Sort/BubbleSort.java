import java.util.Scanner;

public class BubbleSort {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter size of Array : ");
      int size = scanner.nextInt();
      int Array[] = new int[size];
      System.out.println("Enter element of Array : ");
      for (int i = 0; i < size; i++) {
         Array[i] = scanner.nextInt();
      }
      for (int i = 0; i < Array.length; i++) {
         for (int j = 0; j < Array.length - i - 1; j++) {
            if (Array[j] > Array[j + 1]) {
               int temp = Array[j];
               Array[j] = Array[j + 1];
               Array[j + 1] = temp;
            }
         }
      }
      System.out.print("Array sorted :");
      for (int i = 0; i < Array.length; i++) {
         System.out.print("[" + Array[i] + "]");
      }
   }
}