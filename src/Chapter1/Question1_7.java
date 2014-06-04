package Chapter1;

public class Question1_7 {
	public static void replaceZero(int[][] matrix){
		int m = matrix.length;
		int n = matrix[0].length;
		boolean[] row = new boolean[m];
		boolean[] col = new boolean[n];
		
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				if(matrix[i][j] == 0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				if(row[i]||col[j]){
					matrix[i][j] = 0;
				}
			}
		}
		
	}
	
	public static void main(String[] args){
		int[][] matrix = {{1,2,3,0},{4,5,6,9},{7,8,9,9}};
		replaceZero(matrix);
		for (int i = 0; i<matrix.length;i++){
			for(int j=0; j<matrix[0].length;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
