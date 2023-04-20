import java.util.Scanner;
public class Length {
    public static void main(String[]args) {
        System.out.println("Enter a String here:");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println("The input string is here:"+str);
        
            int len ;
            len = str.length();
            System.out.println("The length of the string is "+ len);
        }
    }
}

