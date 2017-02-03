import java.util.Scanner;

/*
 * Objective : This program Remove Duplicate Element from given Array.
 * Date :  17-01-2017
 */

public class DuplicateElement {

	// This function remove duplicate elements from array
	public  int[] removeDuplicate(int arrayParameter1[]) {
			int lengthOfArray=arrayParameter1.length;
			for(int outerLoopIndex=0;outerLoopIndex<lengthOfArray;outerLoopIndex++){
				for(int innerLoopIndex=outerLoopIndex+1;innerLoopIndex<lengthOfArray;innerLoopIndex++){
					if(arrayParameter1[innerLoopIndex]==arrayParameter1[outerLoopIndex]){
						for(int nestedInnerLoop=innerLoopIndex;nestedInnerLoop<lengthOfArray-1;nestedInnerLoop++){
							arrayParameter1[nestedInnerLoop]=arrayParameter1[nestedInnerLoop+1];
						}
						lengthOfArray--;
						innerLoopIndex--;
					}
				}
			}
			int temperaryArray[]=new int[lengthOfArray];
			for(int temperaryArrayIndex=0;temperaryArrayIndex<lengthOfArray;temperaryArrayIndex++){
				temperaryArray[temperaryArrayIndex]=arrayParameter1[temperaryArrayIndex];
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
		DuplicateElement object=new DuplicateElement();
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter Array Length : ");
		int arrayLength=scannerObject.nextInt();
		int array1[]=new int[arrayLength];
		array1=object.inputArrayElements(array1, arrayLength);
		int resultArray[]=object.removeDuplicate(array1);
		showArrayValue(resultArray);			//To Display Resultant Array		
		scannerObject.close();
	}
}
