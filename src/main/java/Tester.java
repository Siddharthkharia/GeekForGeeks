import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int n=5;
		int x=13;

		for (int i=1;i<=n;i++) {
			for (int j=1; j<=i;j++) {
				if (a<=x){
				System.out.print(a + " ");
				a++;
			}
			else
				break;
		}
			System.out.println();
	}
}
}