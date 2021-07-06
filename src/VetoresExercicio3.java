import java.util.Random;
import java.util.Scanner;

public class VetoresExercicio3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random gerador = new Random();
		int cont1=0, cont2=0, cont3=0, cont4=0;
		int vetor[] = new int[10];
		
		for(int i=0; i<vetor.length; i++) {
			vetor[i]= gerador.nextInt(9);
			if(vetor[i]>3 && vetor[i]<7) {
				cont1++;
			}
			if(vetor[i]%2==0) {
				cont2++;
			}
			if(vetor[i]<3) {
				cont3++;
			}
			if((vetor[i]%2)!=0) {
				cont4++;
			}
		}
		
		System.out.println("A quantidade de números entre 3 e 7 é de: " + cont1);
		System.out.println("A quantidade de números pares é de: " + cont2);
		System.out.println("A quantidade de números menores que 3 é de: " + cont3);
		System.out.println("A quantidade de números ímpares é de: " + cont4);
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
