package lambdas;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable");
            }
        };

        new Thread(runnable).start();

        Runnable runnable1 = () -> System.out.println("runnable lambda");

        new Thread(runnable1).start();

        new Thread(()-> System.out.println("1234")).start();
    }
}
