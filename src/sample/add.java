package sample;

public class add implements Runnable {

    public void run() {
        while (Main.full > 0) {
            Main.running = true;
            Main.value = Main.value + 1;
            Main.passed = Main.passed + 1;
            Main.full = Main.full - 1;
            System.out.println("ADD    " + Main.full + " remain          " + Main.value + " value");
        }
            System.out.println("~~~~~~~~~~~~~~~ADD COMPLETE~~~~~~~~~~~~~~~");
            Main.running = false;
    }

}