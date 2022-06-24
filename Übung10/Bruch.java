package Übung10;

public class Bruch {
    
    private int zähler;
    private int nenner;

    private int zähler2;
    private int nenner2;

    public Bruch(int pZähler, int pNenner) {
        zähler = pZähler;
        nenner = pNenner;
    }

    public int getZähler(){
        return zähler;
    }

    public int getNenner(){
        return nenner;
    }

    public void addiere(Bruch pBruch){
        zähler = (zähler * pBruch.nenner) + (nenner * pBruch.zähler);
        nenner = nenner * pBruch.nenner;
    } 
    public void subtrahiere(Bruch pBruch){
        zähler = (zähler * pBruch.nenner) - (nenner * pBruch.zähler);
        nenner = nenner * pBruch.nenner;
    } 

    public void multipliziere(Bruch pBruch){
        zähler = zähler*pBruch.getZähler();
        nenner = nenner*pBruch.getNenner();
    }

    public void dividiere(Bruch pBruch){
        zähler = zähler*pBruch.nenner;
        nenner = nenner*pBruch.zähler;
    }

    public String toString() {
        return zähler + " / " + nenner;
    }
}
