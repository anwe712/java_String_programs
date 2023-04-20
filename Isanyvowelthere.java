import java.util.Scanner;
public class Isanyvowelthere {
   public static void main(String args[]){
      int count = 0;
      System.out.println("Enter a sentence :");
      try (Scanner sc = new Scanner(System.in)) {
        String sentence = sc.nextLine();

          for (int i=0 ; i<sentence.length(); i++){
             char ch = sentence.charAt(i);
             if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                count++;
             }
          }
    }if (count > 0){
      System.out.println("there are vowels/is vowel");
    }else{
        System.out.println("No,there is no vowel");
    }
   }
}