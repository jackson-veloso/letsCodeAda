import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("entre com o valor de x: ");
		int x = scan.nextInt();
		scan.nextLine();
		System.out.print("entre com o valor de y: ");
		int y = scan.nextInt();
		scan.nextLine();
		System.out.println();
		
		if(x<0 && y>0) {
			System.out.println("O ponto está no Quadrante A");
		} else if(x>0 && y>0) {
			System.out.println("O ponto está no Quadrante B");
		} else if(x>0 && y<0) {
			System.out.println("O ponto está no Quadrante C");
		} else if(x<0 && y<0) {
			System.out.println("O ponto está no Quadrante D");
		} else if(x==0 && y!= 0) {
			System.out.println("O ponto está sobre o eixo Y");
		} else if(x!=0 && y==0) {
			System.out.println("O ponto está sobre o eixo X");
		} else {
			System.out.println("O ponto é a coordenada (0,0)");
		}
		
		scan.close();
	}

}
