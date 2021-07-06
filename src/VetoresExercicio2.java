import java.util.Scanner;

public class VetoresExercicio2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double notas[] = new double[3];
		double total = 0;
		double media;
		String alunos[] = new String[notas.length];
		
		for(int i=0; i<notas.length; i++) {
			System.out.println("Digite a nota do" + (i+1) + "aluno: ");
			notas[i] = leitor.nextDouble();
			leitor.nextLine();
			total = total + notas[i];
			System.out.println("Digite o nome do " + (i+1) + "aluno:");
			alunos[i] = leitor.nextLine();
			
			
		}
		media = total/alunos.length;
		
		for(int i=0; i<notas.length; i++) {
			if(notas[i]<media) {
				System.out.println("Chamar o " + alunos[i] + " pra trocar uma ideia");
				System.out.println(media);
			}
		}
 	}
}
