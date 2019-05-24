import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		int n1=0 , cont= 2,mult=0, soma = 0;  
		Scanner s = new Scanner(System.in); 
		System.out.println("Digite um numero: ");
		n1 = s.nextInt(); 
			
		while(cont < 12) {
			if(n1 <= 0) {
				System.out.println("Numero inválido. Digite novamente: ");
				n1 = s.nextInt();
			}
			mult = cont * n1; 
			soma += cont * n1;
			System.out.println(cont + "o numero: " +mult);
			cont++;
			} 
		System.out.println("Soma: " +soma);
		s.close();
	}	

}
