package sealedstuff;

// without a permits, subclasses must be in the same compilation unit (source file) (I BELIEVE!!)
//sealed class Animal {}

// NON-modular JVM, all subtypes of a sealed type must be IN THE SAME PACKAGE
// in a MODULAR JVM all subtypes of the sealed type must be IN THE SAME MODULE
sealed class Animal permits Lion, Sheep {}
final class Lion extends Animal {}
final class Sheep extends Animal {}

public class Ex1 {
  public static void main(String[] args) {

  }
}
