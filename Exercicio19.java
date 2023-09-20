package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio19 {

	public static void main(String[] args) {

		/*
		 * Média de números: Solicite ao usuário para inserir números inteiros positivos
		 * até que ele insira um número negativo. Em seguida, calcule e exiba a média
		 * dos números inseridos.
		 */

		int soma = 0;
		int[] numerosPositivos = new int[5];
		int entrada = 0;

		do {

			for (int i = 0; i < numerosPositivos.length; i++) {

				try {

					entrada = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite um número inteiro positivo"));

					numerosPositivos[i] = entrada;

					if (entrada < 0) {
						JOptionPane.showMessageDialog(null, "Digite apenas números positivos \n ERRO!!");
						break;

					}

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite apenas números nesse campo \n ERRO!!");
					break;
				}

				soma += numerosPositivos[i];
			}

			JOptionPane.showMessageDialog(null,
					" Soma : " + Math.round(soma) + " \n Média : " + Math.round(soma / numerosPositivos.length));
		}

		while (entrada > 0);
	}

}
