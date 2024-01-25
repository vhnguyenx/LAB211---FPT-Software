import java.util.Scanner;

public class DecToHex {
    public void DecToHex() {
        System.out.println("Enter Heximal number: ");
        Scanner scanner = new Scanner(System.in);
        int HexNum = scanner.nextInt();
        int tempBin;
        StringBuilder Reverse = new StringBuilder();
        while (HexNum > 0) {
            tempBin = HexNum % 16;
            Reverse.append(tempBin);
            HexNum = HexNum / 16;
        }
        System.out.println(Reverse.reverse() + "(HEX)");
    }

}
