import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m[][] = new int[4][4];
		int D[] = new int [4];
		int n = 1;
		
	 for (int i = 0; i <4;i++) {
		for(int j = 0; j <4; j++) {
			m[i][j] = n;
			n++;
			if(i == j) {
				D[i] = m [i][j];
			}
		}
	 }
	 for(int i = 0 ; i<4; i++) {
		 System.out.print(D[i] + " ");
	 }
	 	
	}

}
