package ejercicioEnClase2;

public class punto4 {

	public static void main(String[] args) {
		int [][] a = new int[20][20];
		for(int i = 0; i<a.length; i++) {
			for(int j = 0;j<a[i].length;j++) {
				if(j%20==0) {
					System.out.println();
				}
				if(j==i) {
					a[i][j]=1;
				}
				else {
					a[i][j]=0;
				}
				System.out.print(a[i][j]+" ");
			}
		}
	}
}
