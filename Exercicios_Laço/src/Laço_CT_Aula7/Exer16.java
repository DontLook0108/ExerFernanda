package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int idade = 0, nota = 0, otimo = 0, media_pess = 0, idade_pess = 0, pessimo = 0, nsd = 0;

		for (int cont = 0; cont < 100; cont++) {
			System.out.println("Digite sua idade: ");
			idade = s.nextInt();
			System.out.println("Digite a nota do filme: <-1>Não sei dizer <0>Péssimo <1>Ruim <2>Regular <3>Bom <4>Ótimo");
			nota = s.nextInt();
			if (nota < -1 || nota > 4) {
				System.out.println("Nota inválida, digite novamente: ");
				nota = s.nextInt();
			} else if (nota == -1) {
				nsd++;
			}
			if (nota == 0) {
				pessimo++;
				idade_pess += idade;
			}
			if (nota == 4) {
				otimo++;
			}
		}
		media_pess = idade_pess /pessimo ;
		System.out.println(otimo + " pessoa responderam ótimo");
		System.out.println("A média de idade das pessoas que responderam péssimo é: " + media_pess);
		System.out.println(nsd+"% das pessoas nao souberam responder");
		s.close();
	}
}
