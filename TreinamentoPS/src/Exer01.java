import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int num = 0, cont = 0;
		boolean verd=true;
		
		
		do {
			System.out.print("Digite um número de 0 a 9: "); 
			num = s.nextInt(); 
			if(num < 1 || num > 9){
				verd = false; 
				System.out.println("Numero inválido! Digite novamente: "); 
				cont +=1; 
			} else {
				verd = true; 
				calcularValor(num);
			} 
			if(cont == 3) {
				System.out.println("Numero de tentativas excedido"); 
				return;
			}
		} while(verd == false);
		s.close();
	} 
	public static void calcularValor(int num) {
		for(int i = 0; i <= num; i++) {
			System.out.println(""); 
			for(int j = 0; j <= i; j++) {
				int val = j * i; 
				if(val != 0) {
					System.out.print(val + "\t");
				}
			}
		}
	}
	
}
