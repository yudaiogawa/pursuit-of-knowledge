Learnd Package
---

### How to compiling & running a java program

- mainメソッドが存在するクラスのみをビルドすれば使っているクラスもコンパイルしてくれる。

    ```zsh
    % javac com/yudai/lesson/PackageLesson.java
    % ls com/yudai/lesson/greeting | grep .class
    English.class
    Japanese.class
    % java com.yudai.lesson.PackageLesson
    ```
