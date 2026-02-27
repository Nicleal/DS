import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a [][] = new int[5][5];
		int soma = 0;
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0 ; j < 5; j++) {
				System.out.println("Digite um número");
				a[i][j] = ler.nextInt();
				soma += a[i][j];	
			}
			
		}
		
		System.out.println(soma);
	}
}




