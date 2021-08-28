package text;

public class Ex1 {
  public static void main(String[] args) {
    String message = "Dear Fred\n" +
        "I hope this message finds you well.\n" +
        "Best wishes!";

    // multi line string must start with """ at the end (barring whitespace) of a line
    // newline that follows is NOT part of the string
    String message2 = """
        1     \
        ""Hello\"""\""" she\n said
        """;
    System.out.println("xx" + message2 + "xx");
    System.out.println(message2.length());

    String message3 = """
        Hello           \n\
        she said""".indent(4);
    System.out.println(message3 + "--");

  }
}
