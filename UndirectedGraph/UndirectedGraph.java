package UndirectedGraph;

import java.util.Scanner;

public class UndirectedGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrix[][] = {
                { 0, 0, 0, 1, 0 },
                { 0, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 0, 1, 1, 1, 0 } };

        System.out.print("Undirected graph presentation by Matrix :");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
        }

        System.out.println();
        System.out.println("Enter the start point : ");
        int start = scanner.nextInt();
        System.out.println("Enter the end point : ");
        int end = scanner.nextInt();
        if (start > 0 && start <= 5 && end > 0 && end <= 5) {
            if (matrix[start - 1][end - 1] == 1 || matrix[end - 1][start - 1] == 1) {
                System.out.println("This is an edge");
            } else {
                System.out.println("This not an edge");
            }
            scanner.close();
        } else {
            System.out.print("Input not valid");
        }
    }
}
