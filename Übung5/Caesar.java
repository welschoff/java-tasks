package Übung5;

import java.util.Scanner;

public class Caesar {
 
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      System.out.println("Zu verschlüsselnden Text eingeben:");

      String a = sc.nextLine();

      System.out.println("Um wieviele Stellen soll verschoben werden? (1-127)");

      int offset = sc.nextInt(); 
      // Offset (Verschiebung) wählen

      if (offset >= 1 && offset <= 127) {

      char [] meinArray = a.toCharArray();
      // den Text in ein Char Array laden

      char [] meinNeuesArray = verschluesseln(offset, meinArray);
      // mit der Methode (siehe unten) "verschluesseln" ein neues 
      // Char Array mit dem verschlüsselten Text erstellen

      // verschlüsselten Text wieder ausgeben:

          System.out.println("\nSo sieht der Text verschlüsselt aus:");

      for (int i = 0; i < meinNeuesArray.length; i++) {

          System.out.print(meinNeuesArray[i]);
      }
          System.out.println("\n");
          sc.close();
    } 

  }
    public static char[] verschluesseln(int offset, char[] charArray) {
 
      char[] cryptArray = new char[charArray.length];
      // erstmal ein leeres Char Array erstellen

      for (int i = 0; i < charArray.length; i++) {

                  int verschiebung = (charArray[i] + offset)%128;
                  // ursprüngliches Zeichen plus Offset modulo 128

                  cryptArray[i] = (char) (verschiebung);

      }
      return cryptArray;
  }
  }

