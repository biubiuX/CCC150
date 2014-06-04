package Chapter1;

public class Question1_6 {
	public static void rotate90(int[][] array, int N){
		int rotatetime = N;
		for (int layer = 0; layer < N/2 ; layer++){
			for (int k = 0; k < rotatetime-1; k++){
				int tmp = array[layer][layer+k];
				array[layer][layer+k] = array[N-1-layer-k][layer];
				array[N-1-layer-k][layer] = array[N-1-layer][N-1-layer-k];
				array[N-1-layer][N-1-layer-k] = array[layer+k][N-1-layer];
				array[layer+k][N-1-layer] = tmp;
			}
			rotatetime = rotatetime-2;
		}
	}
	
	public static void main(String[] args){
		
		int[][] array = new int[5][5];
		int count = 0;
		for (int i = 0; i<5;i++){
			for (int j = 0; j <5 ; j++){
				array[i][j]=count;
				count++;
				if(String.valueOf(count).length()<2){
					System.out.print(array[i][j]);
					System.out.print(' ');
				}else{
					System.out.print(array[i][j]);
				}
				
			}
			System.out.println();
		}
		//System.out.println(array[0][0]);
		rotate90(array, 5);
		//System.out.println(array[0][0]);
		for (int i = 0; i<5;i++){
			for (int j = 0; j <5 ; j++){
				if(String.valueOf(array[i][j]).length()<2){
					System.out.print(array[i][j]);
					System.out.print(' ');
				}else{
					System.out.print(array[i][j]);
				}
				
			}
			System.out.println();
		}
		
	}
}
