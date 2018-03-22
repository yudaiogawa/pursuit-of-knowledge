public class BitwiseOperator {

  public static void main (String[] args) {
    int onSwitch  = 0b0000_0000_0000_0000_1000;
    int offSwitch = 0b0000_0000_0000_0000_0000;
    int maskBit   = 0b0000_0000_0000_0000_1000;

    int status = onSwitch & maskBit;
    System.out.println("switch on : " + Integer.toHexString(status));
    status = offSwitch & maskBit;
    System.out.println("switch off : " + Integer.toHexString(status));
  }

}