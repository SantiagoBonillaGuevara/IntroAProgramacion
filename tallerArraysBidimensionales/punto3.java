package tallerArraysBidimensionales;

public class punto3 {

	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		String[][] array = new String[x][y];
		array[0][0]="a"+11;
		array[0][1]="a"+21;
		array[1][0]="a"+12;
		array[1][1]="a"+22;
		array[2][0]="a"+13;
		array[2][1]="a"+23;
		for(int c = 0; c<y;c++) {
			for(int i=0;i<x;i++) {
				if(c==1 & i==0) {
					System.out.println();
				}
				System.out.print(array[i][c]);
			}
		}
		System.out.println("\n \n Ahora \n");
		String[][] arrayT = new String[x][y];
		for(int c = 0; c<x;c++) {
			for(int i=0;i<y;i++) {
				arrayT[c][i]=array[c][i];
				if(c==1 & i==0 ||c==2&i==0) {
					System.out.println();
				}
				System.out.print(arrayT[c][i]);
			}
		}
	}
}
