public class aufgabe6 {
    
    public static void main(String[] args){
        
        boolean wahrheit1;
        boolean wahrheit2;
        boolean wahrheit3;
        boolean wahrheit4;
        boolean result;

        boolean wert1 = true;
        boolean wert2 = false;
 
        wahrheit1 = wert1 && wert2;
        wahrheit2 = wert1 && !wert2;
        wahrheit3 = !wert1 && !wert2;
        wahrheit4 = !wert1 && wert2;
        result = wahrheit1 || wahrheit2 || wahrheit3 || wahrheit4;
 
         System.out.println("wahrheit1 = " + wahrheit1);
         System.out.println("wahrheit2 = " + wahrheit2);
         System.out.println("wahrheit3 = " + wahrheit3);
         System.out.println("wahrheit4 = " + wahrheit4);
         System.out.println("result = " + result);
     }
}