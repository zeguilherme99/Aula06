import java.util.Scanner;

public class Matrizes {
	
	
	public static void main(String[] args) {
		Scanner leitor  = new Scanner(System.in);
//		int vetor[] = new int[5];
		int matriz[][] = new int [5][2];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Insira o valor para a linha " + i + " e coluna " + j);
				matriz[i][j]= leitor.nextInt();
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("O valor da linha " + i + " e coluna " + j + " é: " + matriz[i][j]);
			}
		}
		leitor.close();
	}
}
