package useswitch;

public class Ex2 {
  public static void main(String[] args) {
    int x = 3;
    String message = x == 3 ? "it's three" : "it's not three";
    System.out.println(message);

//    String message2 = switch (x) {
//      case 2: yield "it's two";
//      case 3: yield "it's three";
//      default: yield "Something else";
//    };
    String message2 = switch (x) {
      case 2 -> "it's two";
      case 3 -> "it's three";
      default -> {
        System.out.println("I'm executing the default");
        yield "Something else";
      }
    };

    int yield = 99;
    System.out.println(message2);
  }
}
