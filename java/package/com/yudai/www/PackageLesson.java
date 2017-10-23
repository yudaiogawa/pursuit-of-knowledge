package com.yudai.www;
import com.yudai.www.family.Parent;
import com.yudai.www.family.Child;

public class PackageLesson {

  public static void main(String[] args) {
    Parent parent = new Parent("yudai");
    parent.sayName();

    Child child = new Child();
    child.sayName();
  }

}
