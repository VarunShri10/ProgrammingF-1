/*
 * Objective : This program Joins 2 Sorted Array and resultant Array is also Sorted.
 * Date :  17-01-2017
 */

import static org.junit.Assert.assertArrayEquals;

import java.util.Scanner;

public class JoinSortArray {
	
	public int[] join(int firstArray[],int firstArraySize,int secondArray[],int secondArraySize,int resultantArray[]){
		int firstArrayIndex=0;
		int secondArrayIndex=0;
		int resultantArrayIndex=0;
		while((firstArrayIndex<firstArraySize)&&(secondArrayIndex<secondArraySize)){
			if(firstArray[firstArrayIndex]<=secondArray[secondArrayIndex]){
				resultantArray[resultantArrayIndex]=firstArray[firstArrayIndex];
				firstArrayIndex++;
				resultantArrayIndex++;
			}
			else{
					resultantArray[resultantArrayIndex]=secondArray[secondArrayIndex];
					secondArrayIndex++;
					resultantArrayIndex++;
				}
		}
		if(firstArrayIndex==firstArraySize){
			while(secondArrayIndex<secondArraySize){
				resultantArray[resultantArrayIndex++]=secondArray[secondArrayIndex];
				secondArrayIndex++;
			}
		}
		else
			while(firstArrayIndex<firstArraySize){
				resultantArray[resultantArrayIndex++]=firstArray[firstArrayIndex];
				firstArrayIndex++;
			}
		return resultantArray;
	}
	
		// This Function Display Array Value
		public static void showArrayValue(int arrayParameter[]){
			for(int arrayElement:arrayParameter){
					System.out.print(arrayElement+" ");
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
		JoinSortArray object=new JoinSortArray();
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Length of First Array : ");
		int firstArrayLength=scannerObject.nextInt();
		System.out.println("Length of Second  Array : ");
		int secondArrayLength=scannerObject.nextInt();
		int firstArray[]=new int[firstArrayLength];
		int secondArray[]=new int[secondArrayLength];
		firstArray=object.inputArrayElements(firstArray, firstArrayLength);		//Input First Array
		secondArray=object.inputArrayElements(secondArray, secondArrayLength);	//Input Second Array
		int resultantArray[]=new int[firstArray.length+secondArray.length];
		resultantArray=object.join(firstArray,firstArray.length,secondArray,secondArray.length,resultantArray);
		showArrayValue(resultantArray); 					//To Display Result
		scannerObject.close();
	}
}
