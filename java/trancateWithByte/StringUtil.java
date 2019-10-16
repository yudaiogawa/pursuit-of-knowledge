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
   * @param byteLength バイト数
   * @return 文字列
   */
  public static String truncateWithByte(Charset charset, String str, int byteLength) {
    byte[] bytes = str.getBytes(charset);

    ByteBuffer byteBuf = ByteBuffer.wrap(bytes, 0, byteLength);
    CharBuffer charBuf = CharBuffer.allocate(byteLength);

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
   * @param byteLength バイト数
   * @return 文字列
   */
  public static String truncateWithByteSjis(String str, int byteLength) {
    Charset charset = Charset.forName("Shift_JIS");
    byte[] bytes = str.getBytes(charset);

    ByteBuffer byteBuf = ByteBuffer.wrap(bytes, 0, byteLength);
    CharBuffer charBuf = CharBuffer.allocate(byteLength);

    CharsetDecoder decoder = charset.newDecoder();
    decoder.onMalformedInput(CodingErrorAction.IGNORE);
    decoder.decode(byteBuf, charBuf, true);
    decoder.flush(charBuf);

    return new String(charBuf.array(), 0, charBuf.position());
  }
}
