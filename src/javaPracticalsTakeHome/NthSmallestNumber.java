package javaPracticalsTakeHome;

import java.util.Random;
import java.util.Scanner;

public class NthSmallestNumber {
	/*Practical 1: Generate 500 random numbers and
	 *  print the nth smallest number in a programming language of your choice.
	 *  (Ask user for the Nth smallest number)*/
	
	static Random ranNum;
	
	public static void main(String[] args) {
		ranNum = new Random();
		int maxBound = 1000;
		int minBound = 100;
				
		int[] intArr = new int[500];
		System.out.println(intArr.length);
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i]=ranNum.nextInt(maxBound-minBound)+minBound;
		}
			for(int num : intArr) {
			System.out.println(num);
		}
		Scanner ui = new Scanner(System.in);
		System.out.println("Give the Nth smallest number : ");
		int nthNum =ui.nextInt();
		
		for(int j=0; j<intArr.length; j++) {
			for(int k=1;k<intArr.length; k++ ) {
				int t =0;
				if(intArr[k-1]>intArr[k]) {
				t=intArr[k-1];
				intArr[k-1]=intArr[k];
				intArr[k]=t;
				}
			}
			
		}
	
		System.out.println(intArr[nthNum-1]);

	}

}







//public static int randomNumGenerator() {
//ranNum = new Random();
//int randonGenNum = ranNum.nextInt(0,5);
//return randonGenNum;
//}


//int[] genArr = new int[5];
//for(int j =0;j<genArr.length;j++) {
//	genArr[j]=randomNumGenerator(); 
//}
//for (int j=0;j<genArr.length;j++) {
//System.out.println(genArr[j]);
//}
