import java.util.Scanner;

public class FreeStyle {
    public void Number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        //lan thu n xuat hien dau tru
        int x = 1;
        //buoc nhay
        int y = 0;
        for (int i = 0; i < n; i = i + 2) {
            if (x == y) {
                System.out.println(-i);
                x++;
                y = 0;
            } else {
                System.out.println(i);
                y++;
            }

        }
    }

    public static void main(String[] args) {
        FreeStyle freeStyle = new FreeStyle();
        freeStyle.Number();
    }
}
