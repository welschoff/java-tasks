public class aufgabe6 {
    
    public static void main(String[] args){
        
        boolean wahrheit1;
        boolean wahrheit2;
        boolean wahrheit3;
        boolean wahrheit4;
 
        boolean wert1 = true;
        boolean wert2 = false;
 
        wahrheit1 = wert1 && wert2;
        wahrheit2 = wert1 && !wert2;
        wahrheit3 = !wert1 && !wert2;
        wahrheit4 = !wert1 && wert2;
 
         System.out.println(wahrheit1);
         System.out.println(wahrheit2);
         System.out.println(wahrheit3);
         System.out.println(wahrheit4);
     }
}