  import java.util.Scanner;

  public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  int verses;

  System.out.println("Enter the number of verses to print  (1-100):");
  verses = scan.nextInt();

  while(verses<1 || verses>100){
  System.out.println("Please enter a number between 1 and 100:");
  verses = scan.nextInt();
  }
}
