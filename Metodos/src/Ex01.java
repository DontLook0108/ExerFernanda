import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		float n1 = 0; 
		float n2 = 0; 
		int menu = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		n1 = s.nextFloat(); 
		System.out.println("Digite o segundo numero: "); 
		n2 = s.nextFloat();
		System.out.println("Digite a opera��o: <1>Adi��o <2>Subtra��o <3>Divis�o <4>Multiplica��o");
		menu = s.nextInt(); 
		if(menu < 1 || menu > 4) {
			System.out.println("Opera��o invalida, digite novamente: ");
			menu = s.nextInt();
		}
		if(menu == 1) {
		adicao(n1, n2);  
		}
		if(menu == 2) {
		subtracao(n1, n2);  
		} 
		if(menu == 3) {
		divisao(n1, n2); 
		} 
		if(menu == 4) {
		multiplicacao(n1,n2); 
		}
		s.close();
	}
	public static void adicao(float n1, float n2) {
			float resultado; 
			resultado = n1 + n2;  
			System.out.println("Resultado Adi��o: "+resultado);
		}
	public static void subtracao(float n1, float n2) {
		float resultado; 
		resultado = n1 - n2;  
		System.out.println("Resultado Subtra��o: "+resultado);
	}
	public static void divisao(float n1, float n2) {
		float resultado; 
		resultado = n1 / n2;  
		System.out.println("Resultado Divis�o: "+resultado);
	}
	public static void multiplicacao(float n1, float n2) {
		float resultado; 
		resultado = n1 * n2;  
		System.out.println("Resultado Multiplica��o: "+resultado);
	}
	
}
