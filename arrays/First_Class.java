package arrays;

public class First_Class {
	
		public static int maxEntries = 10;
		 int numEntries;

		public class GameEntry{
			String name;
			int score;
			
			public GameEntry(String n , int s) {
					n = this.name;
					s = this.score;
					
			}
			
			public String getName() {
				return name;
			}
			
			public int getScore() {
				return score;
			}
			
			public String toString() {
				return "("+ name + "," +score+")";
			}
			
		}
		
		
		public class Score{
			 GameEntry entries[];
			 
			 public Score() {
				 entries = new GameEntry[maxEntries];
				 numEntries = 0;
			 }
			 
			 public String toString() {
				 String s = "[";
				 for(int i =0 ;i<numEntries;i++) {
					 if(i>0) s +=",";
					 s+= entries[i];
				 }
				 
				 return s + "]";
			 }
			 // ADDS THE NEW SCORE
			 public void add(GameEntry e) {
					Score obj = null;
					int newScore = e.getScore();
					if(numEntries == maxEntries) {
						System.out.println("This is not a high score");
					}
					else {
						numEntries++;
						int i = numEntries-1;
						for(;(1>=1)&&(newScore>obj.entries[i-1].getScore());i--) {
							obj.entries[i] = obj.entries[i-1];
							obj.entries[i] = e;
							
						}
							
					}
				}
			 // REMOVES
			 public GameEntry remove(int i) throws IllegalArgumentException{
					if(i<0 || i>numEntries)
						throw new IndexOutOfBoundsException("Index out of Bound" + i);
					GameEntry temp = entries[i];
					
					for(int j=i;j<numEntries-1;j++) {
						entries[j] = entries[j+1];
						entries[numEntries-1] = null;
						numEntries --;
						
					}
					return temp;
				}
			
		}

		
		
		
		
			
		
		
		
	public static void main(String[] args) {
		

	}

}
