package lambdas;

import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {
        String string1 = "12345";
        String string2 = "12345";
        String string3 = "54321";

        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return 0;
            }
        };

        Comparator<String> comparatorLambda = (a, b) ->
            a.compareTo(b);

        System.out.println("lambda comparator: " + string1.compareTo(string2));
        System.out.println("lambda comparator: " + string1.compareTo(string3));
        System.out.println("lambda compartor: " + comparatorLambda.compare(string1,string3));

    }
}
