package Übung10;


public class aufgabe2 {
    
    public static double[][] subtrahieren(double[][] a, double[][] b) {

        double[][] c = new double[a.length] [a[0].length];

        for(int i = 0; i < a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        return c;
    }

    public static void main(String[] args) {
        double[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        double[][] b = {{9,8,7}, {6,5,4}, {3,2,1}};
        
        double[][] c = subtrahieren(a,b);
    }
}
