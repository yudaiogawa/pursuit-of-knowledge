import java.nio.charset.Charset;

public class Main {

  public static void main(String[] args) {

    String str = "AAAA,BBB,あ";
    Charset charset = Charset.forName("Shift_JIS");

    int strByteLength = str.getBytes(charset).length;
    int byteLength = 10;
    if (strByteLength > byteLength) {
      str = StringUtil.truncateWithByte(charset, str, byteLength);
    }

    System.out.println(str);
  }
}
