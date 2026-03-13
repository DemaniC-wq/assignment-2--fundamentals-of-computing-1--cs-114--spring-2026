import java.util.Scanner;
public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

  System.out.println("Enter a string:");
  String text= scan.nextLine();

  int acount= 0;
  int ecount= 0;
  int icount= 0;
  int ocount= 0;
  int ucount= 0;
  int nonVowelCount= 0;

  for(int i = 0; i < text.length(); i++){
  char c = text.charAt(i);
  if (c == 'a' || c == 'A') {
  acount++;
  }else if (c == 'e' || c == 'E') {
  ecount++;
  } else if (c == 'i' || c == 'I') {
  icount++;
  }else if (c == 'o' || c == 'O') {
  ocount++;
  } else if (c == 'u' || c == 'U') {
  ucount++;
  }else {
  nonVowelCount++;
  }
  System.out.println("a" + acount);
  System.out.println("e" + ecount);
  System.out.println("i" + icount);
  System.out.println("o" + ocount);
  System.out.println("u" + ucount);
  System.out.println("Non-vowels: " + nonVowelCount);

  }
}
