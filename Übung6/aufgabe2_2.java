package Übung6;

public class aufgabe2_2 {
    
	public static void main(String[] args) {

        int summe1 = 0;
        int summe2 = 0;

		for (int i = 0; i <= 10; i++) {
            summe1 += i;
			for (int j = 11; j < 110; j++) {
				summe2 += j;
			}
		}

        System.out.println(summe2 - summe1);
	}
}
