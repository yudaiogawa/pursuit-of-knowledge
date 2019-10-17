import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class StringUtil {

  /**
   * 指定の文字セットおよびバイト数以内に切り捨てた文字列を返します
   * @param str 文字列
   * @param charset 文字セット
   * @param truncateByteSize バイト数
   * @return 文字列
   */
  public static String truncateWithByte(Charset charset, String str, int truncateByteSize) {
    byte[] bytes = str.getBytes(charset);

    int strByteSize = bytes.length;
    if (strByteSize <= truncateByteSize) {
      return str;
    }

    ByteBuffer byteBuf = ByteBuffer.wrap(bytes, 0, truncateByteSize);
    CharBuffer charBuf = CharBuffer.allocate(truncateByteSize);

    CharsetDecoder decoder = charset.newDecoder();
    decoder.onMalformedInput(CodingErrorAction.IGNORE);
    decoder.decode(byteBuf, charBuf, true);
    decoder.flush(charBuf);

    return new String(charBuf.array(), 0, charBuf.position());
  }

  /**
   * 指定のバイト数以内に切り捨てた文字列を返します。
   * 文字セットはSJIS（全角1文字2byte）。
   * @param str 文字列
   * @param truncateByteSize バイト数
   * @return 文字列
   */
  public static String truncateWithByteSjis(String str, int truncateByteSize) {
    Charset charset = Charset.forName("Shift_JIS");
    return truncateWithByte(charset, str, truncateByteSize);
  }
}
