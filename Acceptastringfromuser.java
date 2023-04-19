import java.util.Scanner;
public class Acceptastringfromuser {
    public static void main(String[]args) {
        System.out.println("Enter a String here:");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println("The input string is here:"+str);
        }
    }
}
