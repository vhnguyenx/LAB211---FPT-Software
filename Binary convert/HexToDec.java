import java.util.Scanner;

public class HexToDec {
    public void HexToDec() {
        System.out.println("Enter heximal number: ");
        Scanner scanner = new Scanner(System.in);
        String HexNum = scanner.nextLine();
        StringBuilder Reverse = new StringBuilder();
        Reverse.append(HexNum);
        Reverse.reverse();
        int binary = 0;
        int total = 0;
        for (int i = 0; i < HexNum.length(); i++) {
            char HexInput = Reverse.charAt(i);
            int digit = Character.getNumericValue(HexInput);
            binary = digit * (int) Math.pow(16, i);
            total += binary;
        }
        System.out.println(total + "(HEX)");
    }

}
