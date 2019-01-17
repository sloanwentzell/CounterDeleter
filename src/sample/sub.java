package sample;

public class sub implements Runnable {

    public void run() {
        while (Main.running == true) {
            if (Main.value < 1) {
                //System.out.println();
                //System.out.println("~~~~~~~~~~~~~~~ERROR~~~~~~~~~~~~~~~");
                //System.out.println("         UNAPPLICABLE SUB           ");
                //System.out.println();
            } else {
                Main.value = Main.value - 1;
                Main.received = Main.received + 1;
                System.out.println("  SUB    " + Main.full + "  REMAIN          " + Main.value + "  VALUE");
            }
        }

        while (Main.value > 0) {
            Main.value = Main.value - 1;
            Main.received = Main.received + 1;
            System.out.println("  SUB    " + Main.full + "  REMAIN          " + Main.value + "  VALUE");
        }

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~SUB COMPLETE~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Actions remaining           " + Main.full);
        System.out.println("Items   remaining           " + Main.value);
        System.out.println("Items   passed              " + Main.passed);
        System.out.println("Items   received            " + Main.received);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~PROGRAM COMPLETE~~~~~~~~~~~~~~~");
        System.out.println();

    }

}