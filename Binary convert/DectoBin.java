
import java.util.Scanner;

public class DectoBin {
    public void DecToBin() {
        System.out.println("Enter Dec number:");
        Scanner scanner = new Scanner(System.in);
        int DecNum = scanner.nextInt();
        int tempBin;
        StringBuilder Reverse = new StringBuilder();
        while (DecNum > 0) {
            tempBin = DecNum % 2;
            Reverse.append(tempBin);
            DecNum = DecNum / 2;
        }
        System.out.println(Reverse.reverse() + "(BIN)");

    }

}
