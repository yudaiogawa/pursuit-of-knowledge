public class ReferenceType {

  public static void main(String[] args) {

    // -------- array --------

    int[] x_numbers = {2, 4, 6, 8, 0};
    int[] y_numbers = x_numbers;

    y_numbers[4] = 16; // x_numbersも書き換わっちゃう

    System.out.println(x_numbers[4]);
    System.out.println(y_numbers[4]);

    // -------- String --------

    String x_msg = "lesson";
    String y_msg = x_msg;

    y_msg = "Java"; // String型は基本的に変更不可 - 別領域にデータを保持

    System.out.println(x_msg);
    System.out.println(y_msg);

  }

}
