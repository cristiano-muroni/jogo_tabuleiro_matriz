package matriz;

import java.util.Random;

import jdk.nashorn.api.tree.ForInLoopTree;


public class Tabuleiro {
	private int [][] matriz = new int [10][10];
	private int [] palpites = new int [2];
	
	public int[] getPalpites() {
		return palpites;
	}

	public void setPalpites(int[] palpites) {
		this.palpites = palpites;
	}

	public Tabuleiro() {
		gerar();		
	}
	
	private void gerar() {
		Random aleatorio = new Random();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				matriz [i][j] = aleatorio.nextInt(101);
			}
			
		}
	}
	
	public double jogar() {
		double premio =0.0;
		int qtd1 =0, qtd2 =0;
		//varrer os palpites
		for (int p = 0; p < 2 ; p++) {
			//procurar na matriz
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if(palpites [p] == matriz [i][j]);
					  if(p == 0) qtd1++;
					  if (p == 1) qtd2++;
					
				}
				
			}
			
		}
		if((qtd1 >= 3) || (qtd2 >= 3)){
			int qtd = qtd1 + qtd2;
			premio = qtd * 1000;
		}
		return premio;
	}
	public void imprimir() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%3d", matriz[i][j]);
				
			}
			System.out.println();
			
		}
	}
	
	

}
