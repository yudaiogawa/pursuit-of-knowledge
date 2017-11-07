import java.util.Random;

class StaticInitializer {

  private static int[] luckyNumbers = new int[10];

  // static initializer
  static {
    Random random = new Random();

    for (int i = 0; i < luckyNumbers.length; i++) {
      luckyNumbers[i] = random.nextInt(1000);
    }
  }

  public static void main(String[] args) {
    Random random = new Random();

    // Aim for the 777
    int luckyNumber = luckyNumbers[random.nextInt(luckyNumbers.length)];
    if (luckyNumber == 777) {
      System.out.println("!*!*!*!*!*!*!*!*!*!*!*!*!*!*");
      System.out.println(" Today's LuckyNumber is " + luckyNumber);
      System.out.println("*!*!*!*!*!*!*!*!*!*!*!*!*!*!");
    } else {
      System.out.println("Today's LuckyNumber is " + luckyNumber);
    }
  }

}
