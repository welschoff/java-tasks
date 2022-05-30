package Übung8;

public class aufgabe1 {
    
    public static void signum(int x, int y, int z) {
        System.out.println(Math.signum(x) + " " + Math.signum(y) + " " + Math.signum(z));
    }

    public static void signum(double x, double y, double z) {
        System.out.println(Math.signum(x) + " " + Math.signum(y) + " " + Math.signum(z));
    }

    public static void signum(float x, float y, float z) {
        System.out.println(Math.signum(x) + " " + Math.signum(y) + " " + Math.signum(z));
    }

    public static void signum(long x, long y, long z) {
        System.out.println(Math.signum(x) + " " + Math.signum(y) + " " + Math.signum(z));
    }

    public static void signum(short x, short y, short z) {
        System.out.println(Math.signum(x) + " " + Math.signum(y) + " " + Math.signum(z));

    }

    public static void signum(byte x, byte y, byte z) {
        System.out.println(Math.signum(x) + " " + Math.signum(y) + " " + Math.signum(z));
    }

    public static void main(String[] args) {

        // // Integer
        signum(-1, 0, 1);

        // double
        signum(-1.0, 0.0, 1.0);

        // float
        signum(-1f, 0f, 1f);

        // long
        signum(-1l, 0l, 1l);

        // short
        signum((short)-1, (short)0, (short)1);

        // byte
        signum((byte)-1, (byte)0, (byte)1);
    }
}

