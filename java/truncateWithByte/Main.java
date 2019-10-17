import java.nio.charset.Charset;

public class Main {

  public static void main(String[] args) {
    String str = "AAAA,BBB,あ";
    str = truncateWithByteSjis(str, 10);
    System.out.println(str);
  }

  public static String truncateWithByteSjis(String str, int byteLength) {
    Charset charset = Charset.forName("Shift_JIS");

    int strByteLength = str.getBytes(charset).length;
    if (strByteLength > byteLength) {
      str = StringUtil.truncateWithByteSjis(str, byteLength);
    }

    return str;
  }
}
