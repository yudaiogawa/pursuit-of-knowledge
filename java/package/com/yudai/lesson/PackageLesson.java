package com.yudai.lesson;

import com.yudai.lesson.family.Parent;
import com.yudai.lesson.family.Child;

public class PackageLesson {

  public static void main(String[] args) {
    Parent parent = new Parent("yudai");
    parent.sayName();

    Child child = new Child();
    child.sayName();
  }

}
