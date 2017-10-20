class Ikezaki {

  String intro;
  String verse;

  Ikezaki() {
    this.intro = "空前絶後の";
    System.out.println(intro);
  }

  Ikezaki(String text) {
    this();
    this.verse = "超絶怒涛の" + text;
  }

  void sayYeah() {
    System.out.println(this.verse);
  }

}

public class LearnConstructor {

  public static void main(String[] args) {
    Ikezaki ikezaki = new Ikezaki("コンストラクタ");
    ikezaki.sayYeah();
  }

}
