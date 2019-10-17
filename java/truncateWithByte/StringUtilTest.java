import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringUtilTest {

  public static void main(String[] args) {
    truncateWithByteTest();
    truncateWithByteSjisTest();
  }

  public static void truncateWithByteTest() {
    // Test1
    Charset charset = Charset.forName("Shift_Jis");
    String str = StringUtil.truncateWithByte(charset, "abcdef,ghi", 10);
    String expected = "abcdef,ghi";
    Boolean bool = str.equals(expected) ? true : false;

    String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    System.out.println(methodName + ": Test1: " + bool);

    // Test2
    str = StringUtil.truncateWithByte(charset, "abcdef,ghijklmn", 10);
    bool = str.equals(expected) ? true : false;

    System.out.println(methodName + ": Test2: " + bool);

    // Test3
    str = StringUtil.truncateWithByte(charset, "abcdef,ghあijklmn", 10);
    expected = "abcdef,gh";
    bool = str.equals(expected) ? true : false;

    System.out.println(methodName + ": Test3: " + bool);

    // Test4
    str = StringUtil.truncateWithByte(charset, "abcdあef,ghiklmn", 10);
    expected = "abcdあef,g";
    bool = str.equals(expected) ? true : false;

    System.out.println(methodName + ": Test4: " + bool);

    // Test5
    charset = StandardCharsets.UTF_8;
    str = StringUtil.truncateWithByte(charset, "abcdあef,ghiklmn", 10);
    expected = "abcdあef,";
    bool = str.equals(expected) ? true : false;

    System.out.println(methodName + ": Test5: " + bool);
  }

  public static void truncateWithByteSjisTest() {
    String str = StringUtil.truncateWithByteSjis("AAAA,BBB,あ", 10);
    String expected = "AAAA,BBB,";
    Boolean bool = str.equals(expected) ? true : false;

    String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    System.out.println(methodName + ": " + bool);
  }
}
