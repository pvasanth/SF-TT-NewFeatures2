package verify;

public record Verify(int x) {
  public static void main(String[] args) {
    Object o = new Verify(99);
    System.out.println(switch (o) {
      case Verify v -> "verify with x is " + v.x;
      default -> "something else";
    });
  }
}
