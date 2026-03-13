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
  int bottles = 100;
  for(int i = 0 ; i < verses; i++){
  System.out.println(bottles + " bottles of beer on the wall, " );
  System.out.println(bottles + " bottles of beer, " );
  System.out.println("If one of those bottles should happen to fall, " );
  System.out.println((bottles-1) + " bottles of beer on the wall. " );
  System.out.println();
  bottles--;
}

  }
}
