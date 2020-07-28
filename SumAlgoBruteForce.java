
public class SumAlgoBruteForce {

	
	public int count(int[] a) {
		int count =0 ;
		
		
		for(int i =0 ;i<a.length;i++) {
			for(int j=1;j<a.length;) {
				
				for(int k = j+1 ; k<a.length;k++) {
					if(a[i] + a[j] + a[k] ==0) {
						count++;
					}
				}
			
			}
					}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-1,-1,2,};
		SumAlgoBruteForce obj = new SumAlgoBruteForce();
		
		System.out.println(obj.count(a));

	}

}
