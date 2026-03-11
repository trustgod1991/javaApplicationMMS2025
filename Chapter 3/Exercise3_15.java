import java.util.Scanner;

public class Exercise3_15 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		if(age >= 65){
			System.out.print("Age is greater than or equal to 65");
		}
		else{
			System.out.print("Age is less than 65");
		}	
		
	}
}