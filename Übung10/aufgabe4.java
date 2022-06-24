package Übung10;

public class aufgabe4 {

    public static void main(String[] args) {

        Bruch bruch1 = new Bruch(-3, 5);
        System.out.println(bruch1);
        
        Bruch bruch2 = new Bruch(2,4);
        System.out.println(bruch2);
        
        bruch1.subtrahiere(bruch2);
        System.out.println(bruch1);
     }
    
}
