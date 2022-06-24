package Übung9;

public class aufgabe2 {
    
    public static void main(String[] args) {

        double[] x = {5.0, 9.0, 11.0, 45.0, 21.0, 38.0, 7.0, 65.0};

        double summe = 0.0;

        for(int i = 0; i < x.length; i++) {
            summe += x[i];
        }

        double mittelwert = summe / x.length;

        System.out.println(mittelwert);

        double sum = 0.0;
        for(int i = 0; i < x.length; i++) {
            sum += (1 / x[i]);
        }

        double harm = x.length / sum;
        System.out.println(harm);

        double z = 0;
        for(int i = 0; i < x.length; i++) {
           z += (Math.pow(x[i] - mittelwert, 2) * x[i]);
        }
        double sa;
        sa =  Math.sqrt(z / x.length);
        System.out.println(sa);

    }
}
