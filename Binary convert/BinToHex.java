import java.util.Scanner;

public class BinToHex {
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
            int digit;

            if (Character.isDigit(BinaryInput)) {
                digit = Character.getNumericValue(BinaryInput);
            } else {
                
                digit = BinaryInput - 'A' + 10;
            }
            binary = digit * (int) Math.pow(2, i);
            total += binary;
        }
        System.out.println(Integer.toHexString(total).toUpperCase()+ "(HEX)");
    }

}