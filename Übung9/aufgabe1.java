package Übung9;

public class aufgabe1 {
    
    public static void main(String[] args) {
        String[] strings = {"Hallo", "ich", "bin", "Hendrik"};
        StringBuilder builder = new StringBuilder();
        for(String s : strings) {
            builder.append(s + System.getProperty("line.separator"));
        }
        System.out.println(builder.toString());
    }
}
