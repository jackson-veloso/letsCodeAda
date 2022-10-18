import java.util.Scanner;

/*
 * @autor: Jackson Veloso
 * @email: veloso.jvcb@gmail.com
 */
public class TrianguloJava {
	public static void main(String[] args) {
		int qtdLinha = getQtdLinha();
		
		geraTriangulo(qtdLinha);
	}

	static int getQtdLinha() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com o total de linhas: ");
		int linha = scan.nextInt();
		scan.nextLine();
		scan.close();
		return linha;
	}

	static void geraTriangulo(int linha) {
		for (int i = linha; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
