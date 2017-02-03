/*
 * Objective : This program finds the Longest Increasing Sequence in a Array.
 * Date :  17-01-2017
 */

import static org.junit.Assert.assertArrayEquals;

import java.util.Scanner;

public class IncreasingSequence {
	
	//This function finds Longest Sequence
	public   int[] longestSequence(int arrayParameter[]) {
		// TODO Auto-generated method stub
		int arrayLength=arrayParameter.length;
		int maxSequenceFirstIndex=0;
		int maxSequenceLength=0;
		int temperarySequenceLength=1;
		int arrayFirstIndex;
		int arrayLastIndex;
		int maxSequenceIndex;
		for(arrayFirstIndex=0,arrayLastIndex=0;arrayLastIndex<(arrayLength-1);arrayLastIndex++){
			if(arrayParameter[arrayLastIndex]<arrayParameter[arrayLastIndex+1]){
				temperarySequenceLength++;
			}
			else{
					if(temperarySequenceLength>maxSequenceLength){
						maxSequenceLength=temperarySequenceLength;
						temperarySequenceLength=1;
						maxSequenceFirstIndex=arrayFirstIndex;
						arrayFirstIndex=arrayLastIndex+1;
					}
					else{
						temperarySequenceLength=1;
						arrayFirstIndex=arrayLastIndex+1;
					}
			}
		}
		if(temperarySequenceLength>maxSequenceLength){
			maxSequenceLength=temperarySequenceLength;
			maxSequenceFirstIndex=arrayFirstIndex;
		}
		int temeraryArrayIndex=0;
		int temperaryArray[]=new int[maxSequenceLength];
		for(maxSequenceIndex=maxSequenceFirstIndex;maxSequenceIndex<(maxSequenceFirstIndex+maxSequenceLength);maxSequenceIndex++){
			temperaryArray[temeraryArrayIndex]=arrayParameter[maxSequenceIndex];
			temeraryArrayIndex++;
		}
		return temperaryArray;
	}
	
		// This Function Display Array Value
		public static void showArrayValue(int arrayParameter[]){
			for(int arrayElement:arrayParameter){
				System.out.println(arrayElement);
			}
		}
	
	//  This Function Input Array Elements
			public int[] inputArrayElements(int arrayParameter[],int length){
					Scanner scannerObject=new Scanner(System.in);
					for(int index=0;index<length;index++)
					{
						arrayParameter[index]=scannerObject.nextInt();
					}
					scannerObject.close();
					return arrayParameter;
				}
		//Main Function
		public static void main(String[] args) {
			IncreasingSequence object=new IncreasingSequence();
			Scanner scannerObject=new Scanner(System.in);
			System.out.println("Enter Array Length : ");
			int arrayLength=scannerObject.nextInt();
			int arrayParameter[]=new int[arrayLength];
			arrayParameter=object.inputArrayElements(arrayParameter, arrayLength);	//Input Array
			int result[]=object.longestSequence(arrayParameter);
			showArrayValue(result);								//To Display Result
			scannerObject.close();
	}
}
