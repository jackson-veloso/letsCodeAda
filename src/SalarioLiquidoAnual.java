import java.util.Scanner;

/*
 * @autor: Jackson Veloso
 * @email: veloso.jvcb@gmail.com
 */
public class SalarioLiquidoAnual {
	public static void main(String[] args) {
		
		double salario = getSalario();
		double tercoFerias = getTercoFerias(salario);
		double inssMensal = getContribuicaoMensalINSS(salario);
		double inssTercoFerias = getContribuicaoMensalINSS(tercoFerias);

		// System.out.println("INSS MENSAL= " + inssMensal);

		double salarioBrutoAnual = salario * 13 + tercoFerias;
		double inssAnual = inssMensal * 13;
		//double salarioLiquidoAnual = salarioBrutoAnual - inssAnual;
		double salarioLiquidoAnualAtualizado = salarioBrutoAnual - inssAnual - inssTercoFerias;

		System.out.println();
		System.out.printf("Salário Anual Bruto: %.2f \n", salarioBrutoAnual);
		System.out.printf("Contribuição Anual do INSS: %.2f \n", inssAnual);
		//System.out.printf("Salário Anual Líquido: %.2f \n", salarioLiquidoAnual);
		System.out.printf("Salário Anual Líquido: %.2f \n", salarioLiquidoAnualAtualizado);

	}

	static double getSalario() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com o salário mensal: ");
		double salario = scan.nextDouble();
		scan.nextLine();
		scan.close();
		return salario;
	}

	static double getTercoFerias(double salarioMensal) {
		return salarioMensal * 0.33;
	}

	static double getContribuicaoMensalINSS(double salarioMensal) {
		// O inss tem desconto com base no valor mensal:
		// 0 até 1212.00 -> 7,5%.
		// 1212.01 até 2427,35 -> 9%.
		// 2427,36 até 3641,03 -> 12%.
		// 3641,04 até 7087,22 -> 14%.
		// acima de 7087,22 deve ser descontado o teto de 900 reais.
		double contribuicaoINSS = 0;
		double valorFaixaFinanceira = 0;

		if (salarioMensal > 7087.22) {
			return contribuicaoINSS = 900;
		}

		if (salarioMensal >= 3641.04) {
			valorFaixaFinanceira = (salarioMensal - 3641.03);
			contribuicaoINSS += valorFaixaFinanceira * 0.14;
			salarioMensal -= valorFaixaFinanceira;
		}
		if (salarioMensal >= 2427.36) {
			valorFaixaFinanceira = (salarioMensal - 2427.35);
			contribuicaoINSS += valorFaixaFinanceira * 0.12;
			salarioMensal -= valorFaixaFinanceira;
		}
		if (salarioMensal >= 1212.01) {
			valorFaixaFinanceira = (salarioMensal - 1212.0);
			contribuicaoINSS += valorFaixaFinanceira * 0.09;
			salarioMensal -= valorFaixaFinanceira;
		}
		if (salarioMensal <= 1212.0) {
			contribuicaoINSS += salarioMensal * 0.075;
		}

		return contribuicaoINSS;
	}
}
