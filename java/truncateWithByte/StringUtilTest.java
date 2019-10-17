public class StringUtilTest {

  public static void main(String[] args) {
    truncateWithByteSjisTest();
  }

  public static void truncateWithByteSjisTest() {
    String str = "AAAA,BBB,あ";
    str = StringUtil.truncateWithByteSjis(str, 10);

    String expected = "AAAA,BBB,";
    Boolean bool = str.equals(expected) ? true : false;

    String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    System.out.println(methodName + ": " + bool);
  }
}
