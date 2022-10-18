import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		String cargo1,cargo2,cargo3;
		double salario1,salario2,salario3;
		double newSalario1,newSalario2,newSalario3;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o cargo do funcionario: ");
		cargo1 = entrada.nextLine();
		System.out.print("Digite o salario atual do "+cargo1);
		salario1 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Digite o cargo do funcionario: ");
		cargo2 = entrada.nextLine();
		System.out.print("Digite o salario atual do "+cargo2);
		salario2 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Digite o cargo do funcionario: ");
		cargo3 = entrada.nextLine();
		System.out.print("Digite o salario atual do "+cargo3);
		salario3 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println();
		System.out.println();
		
		if(cargo1.equals("tecnico")){
			newSalario1 = salario1 *1.5;
		} else if(cargo1.equals("gerente")) {
			newSalario1 = salario1 *1.3;
		} else {
			newSalario1 = salario1 *1.2;
		}
		
		
		
		if(cargo2.equals("tecnico")){
			newSalario2 = salario2 *1.5;
		} else if(cargo2.equals("gerente")) {
			newSalario2 = salario2 *1.3;
		} else {
			newSalario2 = salario2 *1.2;
		}
		
		
		
		if(cargo3.equals("tecnico")){
			newSalario3 = salario3 *1.5;
		} else if(cargo1.equals("gerente")) {
			newSalario3 = salario3 *1.3;
		} else {
			newSalario3 = salario3 *1.2;
		}
		
		
		System.out.println("Novos salarios:");
		System.out.println(cargo1 + " = " + newSalario1);
		System.out.println(cargo2 + " = " + newSalario2);
		System.out.println(cargo3 + " = " + newSalario3);
		
		entrada.close();
		
	}
}
