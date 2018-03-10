import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    String boo = "yeeeeees";

    Map<String, String> map = new HashMap<String, String>();
    map.put("true", "yeeeeees");
    map.put("false", "nooooooo");
    
    if (boo.equals(map.get("true"))) {
      System.out.println(map.get("true"));
    } else {
      System.out.println(map.get("false"));
    }

  }

}