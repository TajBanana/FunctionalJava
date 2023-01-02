package lambdas;

import java.util.function.Consumer;

public class LambdaVariable {
  static int i=0;

  public static void main(String[] args) {

    Consumer<Integer> c1 = integer -> {
      //i++;
      System.out.println(i+5);
    };

    i=1;

    c1.accept(6);
  }
}
