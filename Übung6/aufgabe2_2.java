package Übung6;

public class aufgabe2_2 {
    
	public static void main(String[] args) {

		int i = 10;
		int sum = 0;

		do{
			sum += i;
			++i;
		} while(i <= 110);

		System.out.println(sum);
	}
}
