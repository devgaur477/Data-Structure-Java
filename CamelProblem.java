import java.util.LinkedList;

//Please read the following problem carefully, and share the google drive link with your answer. 
//Problem 1: A rich Arabian merchant is traveling with a caravan of 10 camels. She intends to visit several caravanserais for 
//exchanging goods. She doesn’t want to load her camels with water, which is required for survival, in order to maximize trade. 
//Hence, she will provide water to camels at each caravanserai and expect them to conserve water till they reach the next caravanserai.
//However, there is a challenge. Availability of water at a caravanserai is limited although her camels have unlimited capacity to
//store water. You are given the following data: 1. Amount of water available for the merchant’s camels at each caravanserai 2.
//Amount of water required by the merchant’s camels to go to the next caravanserai Example: avail_water = [150, 100] req_water
//= [140, 110] In the above example, we have 2 caravanserais let’s say C1 and C2. Water available at C1 = 150 litres, and at C2
//= 100 litres. Water required to go to C2 from C1 is 140 litres and from C2 to C1 is 110 litres. In this example, the merchan
//t can start from C1, make her camels drink 150 litres. On reaching C2 the camels would have retained 10 litres. They would be
//fetched another 100 litres and can go back to C1 with a total of 110 litres. The merchant needs your help. She needs to start at
//some Caravanserai and come back to the same Caravanserai, after visiting all the Caravanserais in sequence, ensuring that the 
//camels will not need any water in between any two Caravanserai! Your task ---------- Write a Java function that takes two integer
//arrays (avail, req) as input and prints the index of the caravanserai where the merchant can start her journey or prints -1 if the
//merchant cannot go on the journey. If you take any help in solving the problem or have seen this problem before then please mention 
//that in your submission. We value honesty and integrity very much.

public class CamelProblem {
	
	public void water(int []avail , int []req) {
		int sum = 0;
		LinkedList<Integer> cost = new LinkedList<>();
		
		String name[] = new String[avail.length];
		
		
		for(int i =0 ;i<avail.length;i++) {
			name[i] = "c" + ""+i;
			//System.out.println(""+name[i]);
		}
		
		int numberOfcaravanserias = avail.length;
		System.out.println("There are " +numberOfcaravanserias+ " Number of Caravanserias");
		
		for(int i =0 ;i<avail.length;i++) {
				if(avail[i] > req[i]) {
					System.out.println("It can start from " + name[i]);
					sum = avail[i] - req[i];
				}
				
				else {
					System.out.println("-1");
				}
				cost.push(sum);
				
		}
		
		
		for(int i =0;i<avail.length;i++) {
			if(avail[i] > req[i]) {
				System.out.println("Water Left After Journey" + cost.get(i));
			} 
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		int a[] = {150 , 100 , 30 , 100};
		int r[] = {140,110 , 10 , 80};
		
		CamelProblem obj = new CamelProblem();
		obj.water(a, r);
	}

}
