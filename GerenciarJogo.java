package matriz;

import java.util.Scanner;

public class GerenciarJogo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tabuleiro tabuleiro = new Tabuleiro();
		int p[] = new int[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o seu palpite: " + i);
			p[i] = Integer.parseInt(scanner.nextLine());
			
		}
		tabuleiro.setPalpites(p);
		double premio = tabuleiro.jogar();
		if (premio > 0.0) {
			System.out.println("valor do prêmio: " + premio);
			
		}else {
			System.out.println("você não ganhou");
		}
		tabuleiro.imprimir();
		
		
	}

}
