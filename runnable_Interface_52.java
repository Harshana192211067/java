public class runnable_Interface_52 {
    public static void main(String[] args) {
        int n = 5; // Sample input
        Thread fibonacciThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0, b = 1;
                System.out.print(a + " " + b + " ");
                for (int i = 2; i < n; i++) {
                    int next = a + b;
                    System.out.print(next + " ");
                    a = b;
                    b = next;
                }
                System.out.println();
            }
        });
        fibonacciThread.start();
    }
}
