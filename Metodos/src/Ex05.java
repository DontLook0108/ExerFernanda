import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int menu = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("MENU");
		System.out.println("<1>Cadastrar produtos"); 
		System.out.println("<2>Cadastrar lojas");  
		System.out.println("<3>Cadastrar preços"); 
		System.out.println("<4>Procurar o menor preço");
		System.out.println("<5>Listar todos os produtos cadastrados");
		menu = s.nextInt(); 
		
		if(menu < 1 || menu > 5) {
			System.out.println("Escolha inválida, digite novamente: "); 
			menu = s.nextInt();
		} 
		s.close();
	}

}