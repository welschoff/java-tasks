package Übung8;


public class aufgabe3 {

    public static int ggT(int a, int b) {
    if(b == 0) {
    return a;
    } if(a >= b) {
    return ggT(a - b, b);
    }
    System.out.println(a);
    return ggT(a % b, b);
}
}