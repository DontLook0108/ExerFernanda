package Extra_Laço;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int vei = 0, media_vei = 0, aci = 0, maior_aci = 0, media_aci = 0, menor_aci = 999999999, codMaior = 0, codMenor = 0, cidades = 0;
		
		for(int ci = 1; ci < 16; ci++) {
			System.out.print("Qual o numero de veiculos de passeio: ");
			vei = s.nextInt();
			media_vei += vei; 
			System.out.print("Qual o numero de acidentes de transito com vitimas: ");
			aci = s.nextInt(); 
			if (aci > maior_aci) {
				maior_aci = aci; 
				codMaior = ci;
			} 
			if (aci < menor_aci) {
				menor_aci = aci; 
				codMenor = ci;
			} 
			if (vei < 2000) {
				media_aci += aci; 
				cidades++;
			}
		} 
		System.out.println("");
		System.out.println("O maior indice de incidentes ocorre na cidade "+codMaior+" tendo "+maior_aci+" acidentes");
		System.out.println("O menor indice de incidentes ocorre na cidade "+codMenor+" tendo "+menor_aci+" acidentes");
		System.out.println("A media de veiculos nas quinze cidades juntas é de: "+(media_vei/15)+" veiculos por cidade");
		System.out.println("A media de acidentes nas cidades com menos de 2000 veiculos é de "+(media_aci/cidades)+" veiculos");
		s.close();
	}

}
