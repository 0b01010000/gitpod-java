package github.java;

public class NumberPI {

    public static void main(String[] args) {
		// Number PI
		double number = 0.0;
		double NUMBER_PI = 0.0;
		boolean isNegative = false;
		//for (int i = 3; i<=11; i += 2) {
		for (int i = 3; i<=49; i += 2) {
			if (i == 3) {
				number = 1.0 - 1.0/i;
			} else if (isNegative)	{
				number -= 1.0/i;
				isNegative = false; 
			} else {
				number += 1.0/i;
				isNegative = true;
			}
		}
		
		NUMBER_PI = 4*number;
		System.out.println(NUMBER_PI);
		System.out.println(Math.PI);
	}
    
}
