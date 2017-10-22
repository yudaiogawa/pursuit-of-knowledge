class Harry {

  void sayHello() {
    System.out.println("Hello. my name is Harry ;)");
  }

}

class Yudai extends Harry {

  @Override
  void sayHello() {
    System.out.println("こんにちは ;)");
  }

}

public class Lesson {

  public static void main(String[] args) {
    Harry harry = new Harry();
    harry.sayHello();

    Yudai yudai = new Yudai();
    yudai.sayHello();
  }

}
