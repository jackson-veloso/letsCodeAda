import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int k;
		int vetor[] = new int[] {1,2,3,4,5,6,7,8};
		boolean control = false;
		
		
		System.out.print("digite um numero: ");
		
		k = scan.nextInt();
		scan.nextLine();
		
		for(int i=0;i<vetor.length;i++) {
			if(k == vetor[i]) {
				System.out.printf("o valor %d está na posição %d",k,i);
				control = true;
				return;
			}
		}
		
		if(!control) {
			System.out.printf("elemento %d não encontrado",k);
		}
		
		scan.close();
	}
	
}
