import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter word: ");
            String str = sc.nextLine();
            EncryptString(str);
        }
    }
    private static void EncryptString(String str) {
        char c[] = str.toCharArray();
        for (char c1 : c) {
            c1 = (char) (c1 + 5);
            System.out.print(c1);
        }
    }
}
