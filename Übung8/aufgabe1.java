package Übung8;

public class aufgabe1 {
    
    public static int signumInt(int x) {
        System.out.println(Math.signum(x));
        return x;
    }

    public static double signumDouble(double x) {
        System.out.println(Math.signum(x));
        return x;
    }

    public static float signumFloat(float x) {
        System.out.println(Math.signum(x));
        return x;
    }

    public static long signumLong(long x) {
        System.out.println(Math.signum(x));
        return x;
    }

    public static short signumShort(short x) {
        System.out.println(Math.signum(x));
        return x;
    }

    public static byte signumByte(byte x) {
        System.out.println(Math.signum(x));
        return x;
    }

    public static void main(String[] args) {
        signumInt(-1);
        signumInt(0);
        signumInt(1);
        signumDouble(-1.0d);
        signumDouble(0.0d);
        signumDouble(1.0d);
        signumFloat(-1.0f);
        signumFloat(0.0f);
        signumFloat(1.0f);
        signumLong(-1L);
        signumLong(0L);
        signumLong(1L);
        signumShort((short) 1);
        signumShort((short) 0);
        signumShort((short) -1);
        signumByte((byte) 1);
        signumByte((byte) 0);
        signumByte((byte) -1);
    }
}

