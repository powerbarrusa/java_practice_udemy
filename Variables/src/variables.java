import java.util.Scanner;

public class variables {
  public static void main(String[] args) {
    Scanner iScan = new Scanner(System.in);
    System.out.println("Please enter a word");
    String inputWord = iScan.nextLine();
    int vowels = 0;
    for (int i = 0; i < inputWord.length(); i++){
      if (inputWord.charAt(i) == 'a' || inputWord.charAt(i) == 'e' || inputWord.charAt(i) == 'i' || inputWord.charAt(i) == 'o' || inputWord.charAt(i) == 'u' ){
        vowels++;
      }
    }
    System.out.println(vowels);
  }
}