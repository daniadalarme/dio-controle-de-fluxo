package Candidatura;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		boolean entradaValida = false;

		while (!entradaValida) {

			System.out.println("Digite o primeiro parâmetro:");
			int parametroUm = terminal.nextInt();

			System.out.println("Digite o segundo parâmetro:");
			int parametroDois = terminal.nextInt();

			try {
				contar(parametroUm, parametroDois);
				entradaValida = true;
			} catch (ParametrosInvalidosException exception) {

				System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro");
				System.out.println("Tente novamente.\n");
			}
		}

		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}

		int contagem = parametroDois - parametroUm; // Quantidade de interações

		// Loop para imprimir os números incrementados

		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}