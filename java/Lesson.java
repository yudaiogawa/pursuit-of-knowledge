class User {

  void sayHello() {
    System.out.println("Hello ;)");
  }

}

class AdminUser extends User {

  @Override
  void sayHello() {
    System.out.println("こんにちは ;)");
  }

}

public class Lesson {

  public static void main(String[] args) {
    User harry = new User();
    harry.sayHello();
    AdminUser yudai = new AdminUser();
    yudai.sayHello();
  }
}
