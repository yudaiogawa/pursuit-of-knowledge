import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Get byte size a string the input from console.
 * Encodes by Shift_JIS and UTF-8.
 */
public class getBytesInputString {

  public static void main(String []args) {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Get byte size the input string :)");
    System.out.println();
    System.out.print("Please input string >>> ");

    String inputStr = null;
    try {
      inputStr = br.readLine();
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    if (inputStr.isEmpty()) {
      System.out.println();
      System.out.println("Input string is empty.");
      System.out.println("Exit.");
    } else {
      System.out.println();
      System.out.println("Input string is " + inputStr + ".");
      System.out.println();

      Charset enc = Charset.forName("Shift_JIS");
      int bytes = inputStr.getBytes(enc).length;
      System.out.println("Encodes by Shift_JIS: " + Integer.toString(bytes) + " bytes.");

      enc = StandardCharsets.UTF_8;
      bytes = inputStr.getBytes(enc).length;
      System.out.println("Encodes by UTF_8: " + Integer.toString(bytes) + " bytes.");
    }
  }
}
