import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    String boo = "yeeeeees";

    Map<String, String> aMap = new HashMap<String, String>();
    aMap.put("true", "yeeeeees");
    aMap.put("false", "nooooooo");

    Map<String, String> bMap = new HashMap<String, String>();
    bMap.putAll(aMap);

    System.out.println("-------- aMap");
    System.out.println(aMap);
    System.out.println("-------- bMap");
    System.out.println(bMap);

  }

}