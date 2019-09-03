import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int segundos = 0; 
		int minutos = 0; 
		int horas = 0;
		Scanner s = new Scanner(System.in); 
		System.out.print("Digite os segundos: "); 
		segundos = s.nextInt(); 
		conversao(horas,minutos,segundos); 
		s.close();
	}
	public static void conversao(int hrs, int min, int seg) {
		if(seg < 60) {
			System.out.println(seg+" segundos");
		}
		if(seg > 60) {
			min = seg/60; 
			seg = seg % 60;  
			System.out.println(min+" minuto(s) e "+seg+" segundos: ");
			if(min >= 60) {
			hrs = min/60; 
			min = min % 60; 
			System.out.println(hrs+" hora(s), "+min+" minutos e "+seg+" segundos");
			}
		} 
		
	}
}
