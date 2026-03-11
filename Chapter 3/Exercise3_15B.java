public class Exercise3_15B {
	public static void main(String[] args){
		int x = 1, total = 0;   // initialize total to 0
		while (x <= 10) { 
			total += x; 
			++x;
		}
		System.out.println("Total = " + total);
	}
}