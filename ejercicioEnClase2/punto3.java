package ejercicioEnClase2;

public class punto3 {

	public static void main(String[] args) {
	int [][] a = new int[5][5];
		for(int i = 0; i<a.length; i++) {
			for(int j = 0;j<a[i].length;j++) {
				a[i][j]=i*j;
				if(j%5==0) {
					System.out.println();
				}
				System.out.print(a[i][j]+" ");
			}
		}
	}
}