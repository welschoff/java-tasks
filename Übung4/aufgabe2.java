package Übung4;

public class aufgabe2 {
    
    public static void main(String[] args){
        
        float x, y, z;
        int j = 17;

        x = 2304f;
        y = -4096f;
        z = 4096.001953125f;

        if(j != 0 && j > 11 && j < 42) {
            System.out.println("wahr");
        } else {
            System.out.println("falsch");
        }


        System.out.println((x * (y + z)));
        System.out.println((x * y) + (x * z));
     }
}
