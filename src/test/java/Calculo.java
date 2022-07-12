import java.util.Scanner;

public class Calculo {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		Operacoes o = new Operacoes ();
		
		scanner = new Scanner(System.in); 
		System.out.println("Digite o 1º valor:");
		int v1 = scanner.nextInt();
		System.out.println("Digite o 2º valor:");
		int v2 = scanner.nextInt();
		o.soma(v1, v2);
	
	
		System.out.println("Digite o 1º valor ");
		int v3 = scanner.nextInt();
		System.out.println("Digite o 2º valor ");
		int v4 = scanner.nextInt();
		o.dividir(v3, v4);
		
		System.out.println("Digite o 1º valor ");
		int v5 = scanner.nextInt();
		System.out.println("Digite o 2º valor ");
		int v6 = scanner.nextInt();
		o.multiplicar(v5, v6);
		
		System.out.println("Digite o 1º valor ");
		int v7 = scanner.nextInt();
		System.out.println("Digite o 2º valor ");
		int v8 = scanner.nextInt();
		o.subtrair(v7, v8);

	
		
		
 
	}

}
