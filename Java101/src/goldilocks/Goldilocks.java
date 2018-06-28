package goldilocks;

public class Goldilocks {

	public static void main(String[] args) {

		int array[][] = { { 30, 50 }, { 130, 75 }, { 90, 60 }, { 150, 85 }, { 120, 70 }, { 200, 200 }, { 110, 100 } };
		int array2[][]= {{297,90},{66,110},{257,113},{276,191},{280,129},{219,163},{254,193},{86,153},{206,147},{71,137},{104,40},{238,127},{52,146},{129,197},{144,59},{157,124},{210,59},{11,54},{268,119},{261,121},{12,189},{186,108},{174,21},{77,18},{54,90},{174,52},{16,129},{59,181},{290,123},{248,132}};
		chairs(array2);
//System.out.println(array2.length);
	}

	public static void chairs(int array[][]) {
		int weight = 100;
		int temp = 120;
		for (int i = 0; i < array.length; i++) {
			int j = 0;
			if (array[i][j] > weight) {
				int k = 1;
				if (array[i][k] < temp) {
					System.out.println(i + 1);

				}
			}
		}
	}
}
