public class Replace {

  public static void main(String[] args) {
    String original = "insecure";

    // Stringオブジェクトはimmutableであるため、下記ではStringオブジェクトの状態を変更できない。
    original.replace('i', '9');
    System.out.println(original);

    // String.replace()は、変更を加えた文字列を含む新しいStringオブジェクトの参照を返り値として返す。
    // その返り値を使って適切に更新を行う。
    original = original.replace('i', '9');
    System.out.println(original);
  }

}