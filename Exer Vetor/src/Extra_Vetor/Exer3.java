package Extra_Vetor;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int totVendas[] = new int[10]; 
		int vendasTot = 0;
		int valorTot[] = new int[10];
		int maiorVal = 0; 
		String nomeMaior = "";
		int menorVal = 9999;
		String nomeMenor = "";
		int perc[] = new int[10]; 
		String nomes[] = new String[10];
				
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o seu nome: ");
			nomes[i] = s.next();
			System.out.print("Total de vendas: ");
			totVendas[i] = s.nextInt();  
			vendasTot += totVendas[i];
			System.out.print("Percentual de comissão: ");
			perc[i] = s.nextInt(); 
			
			
			valorTot[i] = totVendas[i] + (totVendas[i] * perc[i] / 100); 
			if (valorTot[i] > maiorVal) {
				maiorVal = valorTot[i]; 
				nomeMaior = nomes[i]; 
			} 
			if (valorTot[i] < menorVal) {
				menorVal = valorTot[i]; 
				nomeMenor = nomes[i];
			} 
		} 
		for(int i = 0; i < 10; i++) {
			System.out.println(nomes[i]+" recebeu "+valorTot[i]+"R$ de comissão");
		}
		System.out.println("O total de vendas de todos os funcionarios é: "+vendasTot);
		System.out.println("O maior valor foi de "+maiorVal+"R$ e quem recebeu foi "+nomeMaior); 
		System.out.println("O menor valor foi de "+menorVal+"R$ e quem recebeu foi "+nomeMenor);
		s.close();
	}

}
