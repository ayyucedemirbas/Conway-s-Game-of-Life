public class GameofLife {

	private int size;
	private int[][] state;
	
	public GameofLife(int[][] initialState) {
		this.size = initialState.length;
		this.state = initialState;
	}
	
	private boolean isInBounds(int x, int y) {
		return x >= 0 && x < this.size && y >= 0 && y < this.size;
	}
	
	public int getGameSize() {
		return this.size;
	}
	
	public int getAliveNeighbors(int x, int y) {
		int neighbors = 0;
		for(int i = -1 ; i < 2 ; i++) {
			for(int j = -1 ; j < 2 ; j++) {
				int ii = x+i;
				int jj = y+j;
				if (isInBounds(ii, jj) && (ii != x || jj != y)) {
					neighbors += state[ii][jj];
				}
				 
			}
		}
		return neighbors;
	}
	

	
   
	

}
