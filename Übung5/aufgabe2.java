package Übung5;

public class aufgabe2 {
    

    public static void main(String[] args) {

      
            double breite1,laenge1,breite2,laenge2,radius;
            double entfernung = 0;
            radius= 6378.137/360; 
            
            laenge1=Math.toRadians(7.181563889);
            breite1=Math.toRadians(50.78023889);
            
            laenge2=Math.toRadians(6.0939);
            breite2=Math.toRadians(50.78999167);
    
            //wert=78.084km
            
            double distanz =(laenge1-laenge2)+(laenge1-laenge2);
            System.out.println(distanz);
            double distanzfaktor = Math.acos((Math.sin(breite1)*Math.sin(breite2))+((Math.cos(breite1)*Math.cos(breite2))* (Math.cos(laenge2)-Math.cos(laenge1))));
            
            if (distanz >=0){
                entfernung = radius*distanzfaktor;
            }
            else if(distanz < 0){
                entfernung = radius*(distanzfaktor + Math.PI);
            }
            System.out.println("Entfernung: " + entfernung +" km");
        
    }
}
