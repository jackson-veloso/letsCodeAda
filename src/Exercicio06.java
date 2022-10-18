import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o salário mensal:  ");
		double salarioMensal = scan.nextDouble();
		scan.nextLine();

		double salarioLiqAnual = salarioLiqAnual(salarioMensal);

		System.out.println();
		System.out.printf("O salário líquido anual é %.2f", salarioLiqAnual);

//		//detalhado
//		double salarioAnual = salarioMensal*12;
//		double ferias = calculaFerias(salarioMensal);
//		double salarioBrutoAnual = salarioAnual + salarioMensal + ferias;
//		double contribAnualINSS = calculaAliqINSS(salarioBrutoAnual);
//		
//		System.out.println();
//		System.out.println();
//		System.out.println("Composição:");
//		System.out.printf("Salário Anual: %.2f \n", salarioAnual);
//		System.out.printf("13º Salário: %.2f \n", salarioMensal);
//		System.out.printf("1/3 Férias: %.2f \n", ferias);
//		System.out.printf("Contribuição anual INSS: %.2f \n", contribAnualINSS);

		scan.close();

	}

	static double salarioLiqAnual(double salarioMensal) {
		double salarioAnual = salarioMensal * 13;
		double ferias = calculaFerias(salarioMensal);
		double contribuicaoAnualINSS = calculaAliqINSS((salarioAnual + ferias));

		return (salarioAnual + ferias - contribuicaoAnualINSS);
	}

	static double calculaFerias(double salarioMensal) {
		return salarioMensal * 0.33;
	}

	static double calculaAliqINSS(double salarioContribuicao) {
		return salarioContribuicao * 0.075;
	}
}
