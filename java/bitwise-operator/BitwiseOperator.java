public class BitwiseOperator {

  public static void main(String[] args) {
    int onSwitch  = 0b0000_0000_0000_0000_1000;
    int offSwitch = 0b0000_0000_0000_0000_0000;

    System.out.println("switch on number  : " + Integer.toHexString(logicalConjunction(onSwitch)));
    System.out.println("switch off number : " + Integer.toHexString(logicalConjunction(offSwitch)));
  }

  public static int logicalConjunction(int bit) {
    int mask = 0b0000_0000_0000_0000_1000;
    return bit & mask;
  }

}
