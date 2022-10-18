
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		int num1,num2,num3;
		int max=-999999;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		num1 = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Digite o segundo numero: ");
		num2 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Digite o terceiro numero: ");
		num3 = entrada.nextInt();
		entrada.nextLine();
		
		if(num1 >= max) max=num1;
		if(num2 > max) max=num2;
		if(num3 > max) max=num3;
		
		System.out.println("O maior número é "+max);
		
		entrada.close();
	}

}