import java.util.Scanner;

public class BinToDec {
    public void BinToDec() {
        System.out.println("Enter binary number: ");
        Scanner scanner = new Scanner(System.in);
        String BinNum = scanner.nextLine();
        StringBuilder reverse = new StringBuilder();
        reverse.append(BinNum);
        reverse.reverse();
        int binary = 0;
        int total = 0;
        for (int i = BinNum.length() - 1; i >= 0; i--) {
            char BinaryInput = reverse.charAt(i);
            int digit = Character.getNumericValue(BinaryInput);
            binary = digit * (int) Math.pow(2, i);
            total += binary;
        }
        System.out.println(total + "(DEC)");
    }

}