
import java.util.Scanner;

public class Prime1 {





		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int co = 0;
			int n = s.nextInt();
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					co++;
				}
			}
			if (co == 1) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}


	}

}
