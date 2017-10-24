package com.yudai.lesson;

// import com.yudai.lesson.*;

import com.yudai.lesson.greeting.Japanese;
import com.yudai.lesson.greeting.English;

public class PackageLesson {

  public static void main(String[] args) {
    English english = new English("Hello");
    english.sayHello();

    Japanese japanese = new Japanese("こんにちは");
    japanese.sayHello();
  }

}
