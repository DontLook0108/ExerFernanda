import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		float resp; 
		resp = media(); 
		System.out.println("A media é: "+resp);
	} 
	public static float media() {
		Scanner s = new Scanner(System.in); 
		float media = 0,media1,media2,media3; 
		String letra;
		System.out.print("Digite a media 1: "); 
		media1 = s.nextFloat(); 
		System.out.print("Digite a media 2: ");
		media2 = s.nextFloat(); 
		System.out.print("Digite a media 3: ");
		media3 = s.nextFloat(); 
		System.out.println("Digite o metodo de media que deseja: <A>ritmetica <P>onderada ");
		letra = s.next(); 
		if(letra.equals("A")) {
			media = (media1 + media2 + media3)/3; 
		} 
		if(letra.equals("P")) {
			media = (float) (media1 * 0.2 + media2 * 0.3 + media3 * 0.5);
		}  
		s.close();
		return media;
	}

}
