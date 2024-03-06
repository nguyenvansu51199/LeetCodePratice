package String;

public class str {

  public static void main(String[] args) {
    // Tao string
    String str2 = new String("Xin CHao");
    String str = "Hello";

    // Char
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      System.out.println(c + " co ma ky tu ASCII la: " + (int) c);
    }

    // Tạo char
    Character ch = new Character('c');
    char c = 'B';
    char d = '9';
    char g = 'G';
    // So sanh ky tu voi ma ASCII
    if (c == 66) {
      System.out.println(c + " co ma ky tu ASCII la: " + (int) c);
    }
    ;
    // so sanh ky tu so voi số string
    if (d == '9') {
      System.out.println(d + " co ma ky tu ASCII la: " + (int) d);
    }

    // so sanh ky tu voi string
    if (g == 'G') {
      System.out.println(g + " co ma ky tu ASCII la: " + (int) g);
    }
  }
}
