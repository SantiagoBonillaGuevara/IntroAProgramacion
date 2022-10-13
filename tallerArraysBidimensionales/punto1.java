package tallerArraysBidimensionales;

public class punto1 {

	public static void main(String[] args) {
		int [] [] tablas = new int [10] [10];
		for(int i = 1;i<=tablas.length;i++) {
			for(int c = 1;c<=tablas.length;c++) {
				tablas[i-1][c-1]=i*c;
				System.out.print(c+" x "+i+" = "+tablas[i-1][c-1]);
				if(c%10==0) {
					System.out.println();
				}
				else {
					System.out.print(" ,  ");
				}
			}
		}
	}
}