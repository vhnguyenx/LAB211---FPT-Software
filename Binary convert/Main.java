import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Decimal to binary.");
            System.out.println("2.Deciaml to heximal.");
            System.out.println("3.Binary to decimal.");
            System.out.println("4.Heximal to decimal.");
            System.out.println("5.Binary to heximal.");
            System.out.println("6.Exit program.");
            int a = scanner.nextInt();
            switch (a) {
                case 1: {
                    DectoBin binary = new DectoBin();
                    binary.DecToBin();
                }
                    break;
                case 2: {
                    DecToHex decToHex = new DecToHex();
                    decToHex.DecToHex();
                }
                    break;
                case 3: {
                    BinToDec binToDec = new BinToDec();
                    binToDec.BinToDec();
                }
                    break;
                case 4: {
                    HexToDec hexToDec = new HexToDec();
                    hexToDec.HexToDec();
                }
                    break;
                case 5: {
                    BinToHex binToHec = new BinToHex();
                    binToHec.BinToDec();
                }
                case 6: {
                    System.exit(0);
                }
            }
            continue;
        }

    }
}
