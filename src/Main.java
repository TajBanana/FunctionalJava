import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100 ; i++) {
            sum+=i;
        }

        System.out.println("imperative approach " + sum);

        int sum1 = IntStream.range(0,101).sum();

        System.out.println("declarative approach " + sum1);
    }
}