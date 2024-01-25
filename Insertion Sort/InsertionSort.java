import java.util.Scanner;

class InsertionSort {
    public void InsertionSort() {
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

        int temp;
        for (int i = 0; i < Array.length; i++) {
            temp = Array[i];
            int j = i - 1;
            while (j >= 0 && Array[j] > temp) {
                Array[j + 1] = Array[j];
                j--;
            }
            Array[j + 1] = temp;
        }
        System.out.println(" ");
        System.out.println("Array Sorted :");
        for (int i = 0; i < Array.length; i++) {
            System.out.print("[" + Array[i] + "]");
        }
        scanner.close();
    }
}