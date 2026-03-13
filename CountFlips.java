

  public class CountFlips {
  public static void main(String[] args) {
  Coin myCoin = new Coin();

  int headsCount = 0;
  int tailsCount = 0;


  for(int i = 1;i <=100;i++){
  myCoin.flip();

  if (myCoin.isHeads()) {
  headsCount++;}
  else{
  tailsCount++;
  }
  }
  System.out.println("Number of heads: " + headsCount);
  System.out.println("Number of tails: " + tailsCount);
  }

  }
