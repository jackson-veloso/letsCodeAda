import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o salario:");
		double salario = scan.nextDouble();
		
		System.out.printf("INSS: R$%.2f",(salario*0.075));
		
		scan.close();
	}
}
