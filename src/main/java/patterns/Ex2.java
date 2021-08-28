package patterns;

public class Ex2 {
  public static void main(String[] args) {
    Object obj = null;
    // if you switch on a reference type, you can't have primitive case values...
    String message = switch(obj) {
      case null -> "It's a null!";
      // with "guard conditions" order can suddenly matter.
      case String s && s.length() > 3 -> "It's a longish string " + s;
      case String s && s.length() < 10 -> "It's a shorter string " + s;
      default -> "Something else";
    };
    // You CAN (but would you??) use pattern matches and guards in the colon form of case
    // BUT if you do you MUST NOT fall through.
    System.out.println(message);
  }
}
