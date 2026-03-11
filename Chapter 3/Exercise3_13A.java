//Sum of the First 100 Positive Integers
//Appropriate Type:

//Counter-controlled repetition

//Because:

//You already know exactly how many times the loop should run.

//It must run 100 times.

//That means we use a loop like:

public class Exercise3_13A {
	public static void main(String[] args){
		
		int sum = 0;

			for (int i = 1; i <= 100; i++) {
			sum += i;
			}

			System.out.println("Sum = " + sum);
	}
}