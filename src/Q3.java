public class Q3 
{
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Another Thread :" + Thread.currentThread().getName());
        }).start();
        System.out.println("Main Thread :" + Thread.currentThread().getName());
    }
}
