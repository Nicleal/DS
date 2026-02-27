import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int b[][] = new int[4][4];
		int n = 1;
		
		for(int i =0;i< 4; i++) {
			for(int j = 0; j<4; j++) {
				b[i][j] = n;
				n++;
			}
			
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if (b[i][j] < 10) {
					System.out.print("0" + b[i][j] + " ");
				} else {
					System.out.print(b[i][j] + " ");
				}
			}
			System.out.println();
		}
	}	
}
