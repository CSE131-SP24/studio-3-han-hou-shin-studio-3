package studio3;
import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Let's make the sieve. What's the upper limit?");
		int limit = in.nextInt();
		int field[];
		field = new int[limit];
		for(int i=0;i<limit;i++) {
			field[i] = i+1;
			//System.out.println(field[i]);
		}
		for (int i = 0;i<limit;i++) {
			if (field[i] >1 && field[i]!= 0) {
			for (int multiple = 2; multiple * field[i] <=limit; multiple++) {
				field[field[i]*multiple-1]=0;
			}
			}
			if (field[i]!= 0) {
			System.out.println(field[i]);
			}
		}
			

	}

}
