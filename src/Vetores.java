import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		double alunos[] = new double[10];
		double total=0;
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0; i<alunos.length; i++) {
			System.out.println("DIgite a nota do aluno" + (i+1));
			alunos[i] = leitor.nextDouble();
			total += alunos[i];
		}
		
		for(int i=0; i<alunos.length;i++) {
			System.out.println("O aluno " + (i+1) + " consumiu R$" + alunos[i]);
		}

		System.out.println("O total de consumo foi de R$" + total);
		
		leitor.close();
		

	}

}
