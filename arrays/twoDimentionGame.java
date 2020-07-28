package arrays;

public class twoDimentionGame {
	
	
		public static int X = 1 , O = -1;
		public static int empty = 0;
		public static int board[][] = new int[3][3];
		public static int player;
		
		public twoDimentionGame() {
			emptyBoard();
		}
		
		public void emptyBoard() {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					board[i][j] = empty;
				}
			}
			player = X;
		}
		
		
		public void putMark(int i , int j) throws IllegalArgumentException{
			if(i < 0 || i  > 2 || j < 0 || j  > 2) {
				throw new IllegalArgumentException("invalid Position");
			}
			
			if(board[i][j] != empty) {
				throw new IllegalArgumentException("Board is not empty");
			}
			
			board[i][j] = player;
			player = --player;
			
		}
		
		public boolean isWin(int mark) {
			
			return((board[0][0] + board[0][1] + board[0][2] == mark*3 ||
					board[1][1] + board[2][2] + board[3][3] == mark*3 ||
				    board[0][0] + board[1][0] + board[2][0] == mark*3
					
					
					
					));
			
		}
		
		public int winner() {
			if(isWin(X)) {
				return(X);
			}
			else if (isWin(O)) {
				return (O);
			}
			else 
				return (0);
		}

		
		

	public static void main(String[] args) {
		
		twoDimentionGame obj = new twoDimentionGame();
		//obj.putMark(0, 0);
		obj.putMark(1, 2);
		obj.putMark(0,1);
		obj.putMark(2, 2);
		obj.putMark(1, 1);
		
		
	}

}
