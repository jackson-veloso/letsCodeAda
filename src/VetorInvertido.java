import java.util.Scanner;

public class VetorInvertido {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int MAX = 100;
		int vetor[] = new int[MAX];
		int control = 0;
		int n = 0;
		
		//inicializa vetor
		for(int i=0;i<vetor.length;i++) {
			vetor[i] = 0;
		}
		
		for(int i=0;i<vetor.length;i++ ) {
			System.out.println("digite um numero ou 0 para parar");
			n = scan.nextInt();
			scan.nextLine();
			
			if(n == 0) {
				break;
			} else {
				vetor[i] = n;
				control++;
			}
		}
		
		if(control != 0) {
			int[] vetorInvertido = new int[control];
			
			System.out.println("array invertido:");
			for(int i=0;i<control;i++) {
				vetorInvertido[i] = vetor[control-1-i];
				System.out.print(vetorInvertido[i]+" ");
			}
			
		}
		
		scan.close();			
	}
}
