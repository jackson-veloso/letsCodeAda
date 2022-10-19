
public class MatrizQuadrada {
	public static void main(String[] args) {
		final int DIMENSAO = 20;
		int vetor[][] = new int[DIMENSAO][DIMENSAO];
		
		for(int i=0;i<DIMENSAO;i++) {
			for(int j=0;j<DIMENSAO;j++) {
				if((j-i) >= 0) {
					vetor[i][j] = 0;
				}else {
					vetor[i][j] = 1;					
				}
			}
		}
		
		for(int i=0;i<DIMENSAO;i++) {
			for(int j=0;j<DIMENSAO;j++) {
				System.out.print(vetor[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
