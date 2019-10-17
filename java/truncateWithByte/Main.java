public class Main {

  public static void main(String[] args) {
    String str = "AAAA,BBB,あ";
    str = StringUtil.truncateWithByteSjis(str, 10);
    System.out.println(str);
  }

}
