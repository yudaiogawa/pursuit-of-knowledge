class Ikezaki {

  String msg;

  Ikezaki(String text) {
    this.msg = "超絶怒涛の" + text;
  }

  void sayYeah() {
    System.out.println(this.msg);
  }

}

public class LearnConstructor {

  public static void main(String[] args) {
    Ikezaki ikezaki = new Ikezaki("コンストラクタ");
    ikezaki.sayYeah();
  }

}
