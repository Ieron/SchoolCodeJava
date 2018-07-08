//David Smith

import java.awt.List;
import java.util.Random;

public class sortImplement {

	public static void main(String[] args) {
	
	int[] listA = Lists.getListA();
	int[] listB = Lists.getListB();
	int[] listC = Lists.getListC();
	
	/*Stopwatch w = new Stopwatch();
	
	quickSortMid(listA, 0, listA.length - 1);
	
	System.out.println(w.elapsedTime());
	
	for (int i = 0; i <= listA.length-1; i++){

		System.out.println(listA[i]);
		
	}*/
	
/*	listA = Lists.getListA();
	
	Stopwatch w = new Stopwatch();
	quickSortRan(listA, 0, listA.length - 1);
	System.out.println(w.elapsedTime());
	
	for (int i = 0; i <= listA.length-1; i++){

		System.out.println(listA[i]);
		
	}
	*/
	
	/*listA = Lists.getListA();
	
	Stopwatch w = new Stopwatch();
	quickSortRanI(listA, 0, listA.length - 1);
	System.out.println(w.elapsedTime());
	for (int i = 0; i <= listA.length-1; i++){

		System.out.println(listA[i]);
		
	}*/
	
	/*Stopwatch w = new Stopwatch();
	quickSortMid(listB, 0, listB.length - 1);
	System.out.println(w.elapsedTime());
	for (int i = 0; i <= listB.length-1; i++){

		System.out.println(listB[i]);
		
	}*/
	
	/*listB = Lists.getListB();
	Stopwatch w = new Stopwatch();
	quickSortRan(listB, 0, listB.length - 1);
	System.out.println(w.elapsedTime());
	for (int i = 0; i <= listB.length-1; i++){

		System.out.println(listB[i]);
		
	}
	*/
	
	/*listB = Lists.getListB();
	Stopwatch w = new Stopwatch();
	quickSortRanI(listB, 0, listB.length - 1);
	System.out.println(w.elapsedTime());
	for (int i = 0; i <= listB.length-1; i++){

		System.out.println(listB[i]);
		
	}*/
	
	Stopwatch w = new Stopwatch();
	
	quickSortMid(listA, 0, listA.length - 1);
	System.out.println("It took " + w.elapsedTime() + " milliseconds to sort.\n");
	System.out.println("ListC: "+ java.util.Arrays.toString(listA));
	
	w.Restart();
	quickSortMid(listB, 0, listB.length - 1);
	System.out.println("\nIt took " + w.elapsedTime() + " milliseconds to sort.\n");
	System.out.println("ListC: "+ java.util.Arrays.toString(listB));
	
	quickSortMid(listC, 0, listC.length - 1);
	System.out.println("\nIt took " + w.elapsedTime() + " milliseconds to sort.\n");
	System.out.println("ListC: "+ java.util.Arrays.toString(listC));
	
	
	
	//for (int i = 0; i <= listC.length-1; i++){

	//	System.out.println(listC[i]);
		
	//}
	
	
	/*listC = Lists.getListC();
	Stopwatch w = new Stopwatch();
	quickSortRan(listC, 0, listC.length - 1);
	System.out.println(w.elapsedTime());
	for (int i = 0; i <= listC.length-1; i++){

		System.out.println(listC[i]);
		
	}*/
	
	/*listC = Lists.getListC();
	Stopwatch w = new Stopwatch();
	quickSortRanI(listC, 0, listC.length - 1);
	System.out.println(w.elapsedTime());
	for (int i = 0; i <= listC.length-1; i++){

		System.out.println(listC[i]);
		
	}*/

}



	public static void quickSortMid(int[] list, int min, int max) {
	
		if (min < max){
			
			int indexp = partitionMid(list, min, max);
			if (min < indexp -1)
			quickSortMid (list, min, indexp - 1);
			if (indexp < max)
			quickSortMid (list, indexp, max);
				
		}
		
	}
	
	public static int partitionMid(int[] list, int min, int max) {
		
		int left, right;
		int pivot = list[(min + max)/2];
		
		left = min;
		right = max;
		
		while (left <= right){
			
			while (list[left]<pivot) left++;
			while (list[right]>pivot) right--;
			
			if (left <= right){
				swap(list, left, right);
				left++;
				right--;
			}
						
		}
		
		return left;
		
	}

	public static void quickSortRan(int[] list, int min, int max) {
		
		if (min < max){
			
			int indexp = partitionRan(list, min, max);
			if (min < indexp -1)
			quickSortMid (list, min, indexp - 1);
			if (indexp < max)
			quickSortMid (list, indexp, max);
				
		}
		
	}
	
	public static int partitionRan(int[] list, int min, int max) {
		Random ran = new Random();
		int left, right;
		int pivot = ran.nextInt(max-min+1)+min;
		
		left = min;
		right = max;
		
		while (left <= right){
			
			while (list[left]<pivot) left++;
			while (list[right]>pivot) right--;
			
			if (left <= right){
				swap(list, left, right);
				left++;
				right--;
			}
						
		}
		
		return left;
		
	}
	public static void quickSortRanI(int[] list, int min, int max) {
		
		if (min < max){
			
			int indexp = partitionMid(list, min, max);
			if (min < indexp -1)
			quickSortMid (list, min, indexp - 1);
			if (indexp < max)
			quickSortMid (list, indexp, max);
				
		}
		
	}
	
	public static int partitionRanI(int[] list, int min, int max) {
		
		Random ran = new Random();
		
		int left, right;
		int x = ran.nextInt(max-min+1)+min;
		int y = ran.nextInt(max-min+1)+min;
		int z = ran.nextInt(max-min+1)+min;
		int m[] = {x, y, z};
		
		if(m[0]>m[1]) swap(m, m[0], m[1]);
		if(m[1]>m[2]) swap(m, m[1], m[2]);
		if(m[0]>m[1]) swap(m, m[0], m[1]);
		
		int pivot = m[2];
		
		left = min;
		right = max;
		
		while (left <= right){
			
			while (list[left]<pivot) left++;
			while (list[right]>pivot) right--;
			
			if (left <= right){
				swap(list, left, right);
				left++;
				right--;
			}
						
		}
		
		return left;
		
	}

	private static void swap(int[] data, int a, int b) {
		
		int temp;
		temp = data[a];
		data[a] = data [b];
		data[b] = temp;
		
	}
	
}
