import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		float resp; 
		resp = percentual(); 
		System.out.println("Percentual: "+resp+"%");
	}
	public static float percentual() {
		Scanner s = new Scanner(System.in);
		float prec1,prec2,perc; 
		System.out.print("Digite o valor do produto 1: ");
		prec1 = s.nextFloat(); 
		System.out.print("Digite o valor do produto 2: ");
		prec2 = s.nextFloat(); 
		perc = ((prec1 - prec2)/prec1)*100; 
		s.close();
		return perc * -1;
	} 
}
