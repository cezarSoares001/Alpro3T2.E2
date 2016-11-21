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

    
	public static int[][] gerarMatrizEspiral(int n, int b) {
		
		int i,a;
		
		
		add(1);
        int[][] M = new int[n + 1][n + 1];
       
        for (add(2), a = 1; a <= n / 2;add(4), a++) {
        	
            for (add(2),i = a; i <= n - a;add(3), i++) {
            	add(3);
                M[a][i] = b;
                b++;
                
                        
            }
            for (add(2), i = a; i <= n - a;add(3), i++) {
            	add(3);
                M[i][n - a + 1] = b;
                b++;
            }
            for (add(2), i = n - a + 1; i >= a + 1;add(3), i--) {
                M[n - a + 1][i] = b;
                b++;
            }
            for (add(2),i = n - a + 1; i >= a + 1;add(3), i--) {
            	add(3);
                M[i][a] = b;
                b++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = b;
        }
        return M ;
        
    }
	public int[][] lista(){
		int[][] list=gerarMatrizEspiral(n,b);
		list.clone();
		
		return list;
		}
	
	
}
