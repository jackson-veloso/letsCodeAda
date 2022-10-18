
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		int num1,num2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		num1 = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Digite o segundo numero: ");
		num2 = entrada.nextInt();
		entrada.nextLine();
		

		System.out.println("Os números digitados foram:");
		if(num1 <= num2) {
			System.out.println(num1 + " " +num2);			
		}else {
			System.out.println(num2 + " " +num1);						
		}
		
		entrada.close();
	}

}