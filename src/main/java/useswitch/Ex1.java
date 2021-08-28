package useswitch;

public class Ex1 {
  public static void main(String[] args) {
    int x = 5;
//    switch (x) {
//      case 1:
//      case 3:
//      case 5:
//        int value = 0;
//        System.out.println("It's odd");
//        break;
//      case 2:
////        int value = 2;
//        System.out.println(value);
//        System.out.println("It's two");
//        break;
//    }

    switch (x) {
      default -> System.out.println("It's something else");
      case 1, 3, 5, 7, 9 -> {
        int value = 99;
        System.out.println("it's odd");
        System.out.println("Strange");
      }
      case 2, 4, 6, 8 -> {
        int value = 99;
        System.out.println("it's even");
      }
    }
  }
}
