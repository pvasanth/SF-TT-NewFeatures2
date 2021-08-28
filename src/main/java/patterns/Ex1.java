package patterns;

import java.util.Objects;

class Value {
  private int v;

  public Value(int v) {
    this.v = v;
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof Value val && val.v == this.v;
  }

  @Override
  public int hashCode() {
    return Objects.hash(v);
  }

  @Override
  public String toString() {
    return "Value{" +
        "v=" + v +
        '}';
  }
}

public class Ex1 {
  public static void main(String[] args) {
    Object o = "Hello";
    if (o instanceof String) {
      String s = (String)o;
      System.out.println("length of s is " + s.length());
    }

    if (!(o instanceof String s)) {
      System.out.println("There is no s ");
    } else {
      System.out.println(s);
    }

    if (o instanceof String s) {
      System.out.println("length of s is " + s);
    } else {
      System.out.println("There is no s");
    }

    if (o instanceof String s && s.length() > 3) {
      System.out.println("s is long, in fact " + s.length());
    }

  }
}
