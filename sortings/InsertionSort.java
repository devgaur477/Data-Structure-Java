package sortings;

import java.util.Arrays;
import java.util.Random;
public class InsertionSort {
	
	
public void sortD(int n[]) {
			
			int b = n.length;
			
			for(int i=1 ; i<b;i++) {
				int temp = n[i];
				int j = i-1;
				while((j>=0)&&(n[j] > temp)) {
					n[j+1] = n[j--];
					n[j+1] = temp;
				}
			}
			
			for(int i=0;i<b;i++) {
				System.out.println(""+n[i]);
			}
		}
	
	
	public static void main(String[] args) {
		InsertionSort obj = new InsertionSort();
		int x[] = new int[10];
		Random ran = new Random();
		for(int i=0;i<x.length;i++) {
			x[i] = ran.nextInt(100);
		}
		
		Arrays.sort(x);
		int i = 0;
		while( i < 9) {
			System.out.println(""+x[i]);
			i++;
		}
		
		
//		int a[] = {1,6,4,10,9,12,4,14,1,24};
//		obj.sortD(a);
		
		
		
		
		
	}
}
