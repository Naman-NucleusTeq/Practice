package array;

public class JaggedArray {

	public static void main(String[] args) {
		
		int[][] twodarray = new int[2][];
		twodarray[0] = new int[3];
		twodarray[1] = new int[4];
		
		int counter = 0;
		
		for(int row = 0; row<twodarray.length; row++) {
			for(int col = 0; col<twodarray[row].length; col++) {
				twodarray[row][col] = counter++;
			}
		}
		
		for(int row = 0; row<twodarray.length; row++) {
			System.out.println();
				System.out.print(twodarray[row][col] + " ");
			}
		keFMLefm
		EFEF
		}
		
	}

}
