class Super {

  private String msg;
  private int num;

  Super(String msg, int num) {
    this.msg = msg;
    this.num = num;
  }

  void show() {
    System.out.println(msg + " " + num);
  }

}

class Sub extends Super {

  Sub() {
    super("キャッシュカードの暗証番号", 8931);
  }

}

class ConstructorOfSuperClass {

  public static void main(String[] args) {
    Sub sub = new Sub();
    sub.show();
  }

}
