package methodreference;

import java.util.function.Function;

public class FunctionMethodReference {
  static Function<String,String> toUpperCaseLambda = s -> s.toUpperCase();
  static Function<String,String> toUpperCaseMethodReference = String::toUpperCase;

  public static void main(String[] args) {

  }
}
