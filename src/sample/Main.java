package sample;

public class Main {
    static public int full = 300;
    static public int value = 0;
    static public int passed = 0;
    static public int received = 0;
    static public boolean running = true;

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Item count        " + full);
        System.out.println();

        Runnable add = new add();
        Runnable sub = new sub();

        Thread addThread = new Thread(add);
        Thread subThread = new Thread(sub);

        addThread.start();
        subThread.start();
        }

    }