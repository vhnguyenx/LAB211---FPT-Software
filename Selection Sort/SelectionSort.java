
import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of Array : ");
    int size = scanner.nextInt();
    int Array[] = new int[size];
    System.out.println("Enter number of Array : ");
    for (int i = 0; i < size; i++) {
      Array[i] = scanner.nextInt();
    }
    System.out.println("Unsorted array :");
    for (int i = 0; i < Array.length; i++) {
      System.out.print("[" + Array[i] + "]");
    }
    scanner.close();
  }

}
