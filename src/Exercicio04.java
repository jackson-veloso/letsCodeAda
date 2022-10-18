import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Salario: ");
		double salario = entrada.nextDouble();
		entrada.nextLine();
		
		double media = (salario * 13)/12;
		System.out.printf("Media anual de salario: %.2f",media);
		
		entrada.close();
	}
}
