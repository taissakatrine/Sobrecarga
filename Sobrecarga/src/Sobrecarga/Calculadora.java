package Sobrecarga;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Entrada
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a operação:\n"
							+"1-adição dois valores inteiros\n"
							+"2-subtração\n"
							+"3-multiplicação\n"
							+"4-divisão\n"
							+"5-exponenciação\n"
							+"6-fatorial\n"
							+"7-adição três valores\n"
							+"8-adição dois valores texto");
		int tipo = teclado.nextInt();
		System.out.println("Digite o valor 1:");
		int valor1 = teclado.nextInt();
		int valor2 = 0;
		if (tipo != 5 && tipo != 6) {
			System.out.println("Digite o valor 2:");
			valor2 = teclado.nextInt();
		}
		teclado.close();
		
		//Processamento e Saída
		Operacao operacao = new Operacao();
		
		switch (tipo) {
		//passagem de parametros retornando por função
		case 1 : System.out.println("Adição 2 valores inteiros="+operaçao.soma(valor1, valor2)); break;
		}
	}

}
