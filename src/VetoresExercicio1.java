import java.util.Scanner;

public class VetoresExercicio1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String atividades[] = new String[2];
		String ordem;
		for(int i=0; i<atividades.length; i++) {
			System.out.println("Qual foi sua atividade?");
			atividades[i] = leitor.next();
		}
		
		System.out.println("Deseja ver em ordem Decrescente ou Crescente?");
		ordem = leitor.next();
		
		if(ordem.equalsIgnoreCase("Decrescente")) {
			for(int i=atividades.length -1; i>=0; i--) {
				System.out.println("Suas atividades foram:  " + atividades[i]);
			}
		}else if(ordem.equalsIgnoreCase("Crescente")){
			for(int i=0; i<atividades.length; i++) {
				System.out.println("Suas atividades foram:  " + atividades[i]);
			}
		}else {
			System.out.println("Valor desconhecido");
		}
		
		
	}
}
