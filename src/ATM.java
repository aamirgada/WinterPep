class Hi implements Runnable {
    public void run() {
        System.out.println("HI Aamir");
    }

}

class Hello implements Runnable {
    public void run() {
        System.out.println("Hello Aamir");
    }
}

public class ATM {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Hi());
        Thread t2 = new Thread(new Hello());

        t1.start();
        t2.start();
    }
}
