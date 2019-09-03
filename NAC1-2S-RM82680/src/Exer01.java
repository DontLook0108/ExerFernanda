import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		int quant_alunos = 0;
		int menu = 0; 
		int cad = 0;
		int aux = 0;
		int prog = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos ");
		quant_alunos = s.nextInt();

		int rm[] = new int[quant_alunos];
		String nomes[] = new String[quant_alunos];
		String info[] = new String[quant_alunos];
		float mediaCT[] = new float[quant_alunos];
		float media2CT[] = new float[quant_alunos];
		float mediaDDD[] = new float[quant_alunos];
		float media2DDD[] = new float[quant_alunos];
		float mediaBD[] = new float[quant_alunos];
		float media2BD[] = new float[quant_alunos];

		for (int cont = 0; cont < prog; cont++) {
			System.out.println("Menu");
			System.out.println("1 - Cadastrar RM e nomes");
			System.out.println("2 - Cadastrar Médias do 1º semestre de 2019");
			System.out.println("3 - Listar alunos cadastrados");
			System.out.println("4 - Sair");
			menu = s.nextInt();
			if (menu < 1 || menu > 4) {
				System.out.println("Opção inválida, digite novamente: ");
				menu = s.nextInt();
			} else {
				if (menu == 1) {
					System.out.println("Iniciar Cadastro"); 
					for(int i = 0; i < quant_alunos; i++) {
					System.out.print("Digite o RM: ");
					rm[i] = s.nextInt();
					if (cont == 0) {
						aux = rm[i];
					} else {
						if (rm[i] == aux) {
							System.out.println("RM repetido, digite novamente: ");
							rm[i] = s.nextInt();
						}
					}
					System.out.print("Digite o nome do aluno: ");
					nomes[i] = s.next(); 
					cad++;
					} 
				}
				if (menu == 2) {
					System.out.println("Cadastrar notas");
					for (int i = 0; i < cad; i++)
						if (i == quant_alunos) {
							System.out.println("Notas cadastradas");
						} else {
							{ 
								System.out.println("Aluno: "+nomes[i]+" RM: "+rm[i]);
								System.out.println("Media Computational Thinking: ");
								mediaCT[i] = s.nextFloat();
								if (mediaCT[i] < 0 || mediaCT[i] > 10) {
									System.out.print("Média inválida, digite novamente: ");
									mediaCT[i] = s.nextFloat();
								}
								if (mediaCT[i] < 2) {
									info[i] = "Exame";
									media2CT[i] = 8 - mediaCT[i];
								} else { 
									media2CT[i] = 12 - mediaCT[i];
								}
								System.out.println("Media Domain Driven Design: ");
								mediaDDD[i] = s.nextFloat();
								if (mediaDDD[i] < 0 || mediaDDD[i] > 10) {
									System.out.print("Média inválida, digite novamente: ");
									mediaDDD[i] = s.nextFloat();
								}
								if (mediaDDD[i] < 2) {
									info[i] = "Exame";
									media2DDD[i] = 8 - mediaDDD[i];
								} else { 
									media2DDD[i] = 12 - mediaDDD[i];
								}
								System.out.println("Média Implementação de Dados: ");
								mediaBD[i] = s.nextFloat();
								if (mediaBD[i] < 0 || mediaBD[i] > 10) {
									System.out.print("Média inválida, digite novamente: ");
									mediaBD[i] = s.nextFloat();
								}
								if (mediaBD[i] < 2) {
									info[i] = "Exame";
									media2BD[i] = 8 - mediaBD[i];
								} else {
									media2BD[i] = 12 - mediaBD[i];
								}
							}
						}
				}
				if (menu == 3) {
					System.out.println("Lista dos cadastrados: ");
					for (int j = 0; j < quant_alunos; j++) {
						System.out.println("RM do aluno: " + rm[j]);
						System.out.println("Nome do aluno: " + nomes[j]);
						System.out.println("Média em CT: " + mediaCT[j] + "  Nota minima 2º sem: " + media2CT[j]);
						System.out.println("Média em DDD: " + mediaDDD[j] + "  Nota minima 2º sem: " + media2DDD[j]);
						System.out.println("Média em BD: " + mediaBD[j] + "  Nota minima 2º sem: " + media2BD[j]);
						System.out.println("Info do aluno: "+info[j]);
					}
				}
				if (menu == 4) {
					cont = prog;
					System.out.println("Saindo...");
				}
			}
			prog++;
		}
		System.out.println("Saiu");
		s.close();
	}

}
