package Espiral;
import static Contagem.Contagem.*;

import java.util.List;
public class Espiral{
int n,b;
	public static int entradaT(int n, int b){
		if(n<=0 || b<=0){
			throw new IllegalArgumentException();
		}
		return 0;
	}
    
	
public static int[] entradaEspiral(int tabuleiro[], int m) {
	int a,i;
	add(1);
    int[][] M = new int[tabuleiro[0] + 1][tabuleiro[0] + 1];

    for (add(2), a = 1; a <= tabuleiro[0] / 2;add(4), a++) {
    	//System.out.print("L1");
        for (add(2), i = a; i <= tabuleiro[0] - a;add(3), i++) {
      //  	System.out.print("L2");
        	add(3);
        	M[a][i] = m;
            m++;
        }
        for (add(2), i = a; i <= tabuleiro[0] - a;add(3), i++) {
        //	System.out.print("L3");
        	add(3);
        	M[i][tabuleiro[0] - a + 1] = m;
            m++;
        }
        for (add(2), i = tabuleiro[0] - a + 1; i >= a + 1;add(3), i--) {
        	add(3);
        	M[tabuleiro[0] - a + 1][i] = m;
            m++;
        }
        for (add(2), i = tabuleiro[0] - a + 1; i >= a + 1;add(3), i--) {
        	add(3);
        	M[i][a] = m;
            m++;
        }
    }
    if (tabuleiro[0] % 2 == 1) {
        M[tabuleiro[0] / 2 + 1][tabuleiro[0] / 2 + 1] = m;
        add(2);
    }

    int r[] = auxiliar(M, tabuleiro[1]);
    add(2);
    return r;
}


private static int[] auxiliar(int[][] matriz, int b) {
    int resultado[] = new int[2];
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if (matriz[i][j] == b) {
                resultado[0] = i;
                resultado[1] = j;
                break;
            }
        }
    }
    return resultado;
}
}
