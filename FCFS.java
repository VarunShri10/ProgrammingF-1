/*
 * Objective : This program return Waiting time of each Job along With Arrival Time, 
 * 				Starting Time, Finish Time in Two Dimensional Array.
 * Date :  17-01-2017
 */
import static org.junit.Assert.assertArrayEquals;

import java.util.Scanner;

public class FCFS {
	
	//This Function Calculates Waiting Time in store it in array
	public  int[][] checkFCFS(int arrivalTimeArray[],int jobSizeArray[]){
		int arrayLength=jobSizeArray.length;
		int job[]=new int[arrayLength];
		int jobStartTime[]=new int[arrayLength];
		int jobFinishTime[]=new int[arrayLength];
		int jobWaitTime[]=new int[arrayLength];
		int index;
		jobStartTime[0]=arrivalTimeArray[0];
		jobFinishTime[0]=jobSizeArray[0];
		jobWaitTime[0]=jobStartTime[0]-arrivalTimeArray[0];
		for(index=1;index<arrayLength;index++){
			if(arrivalTimeArray[index]<=jobFinishTime[index-1]){
				jobStartTime[index]=jobFinishTime[index-1]+1;
				jobFinishTime[index]=jobFinishTime[index-1]+jobSizeArray[index];
				jobWaitTime[index]=jobStartTime[index]-arrivalTimeArray[index];
			}
			else{
				jobWaitTime[index]=0;
				jobStartTime[index]=arrivalTimeArray[index];
				jobFinishTime[index]=arrivalTimeArray[index]+jobSizeArray[index]-1;
			}
		}
		int result[][]=new int[arrayLength][4];
		for(int resultArrayIndex=0;resultArrayIndex<arrayLength;resultArrayIndex++){
			result[resultArrayIndex][0]=arrivalTimeArray[resultArrayIndex];
			result[resultArrayIndex][1]=jobWaitTime[resultArrayIndex];
			result[resultArrayIndex][2]=jobStartTime[resultArrayIndex];
			result[resultArrayIndex][3]=jobFinishTime[resultArrayIndex];
		}
		return result;
	}
	
	//This Function Display 2-D Array Elements
	public void displayArray(int arrayParameter[][]){
		for(int arrayRow[]:arrayParameter){
			for(int arrayElement:arrayRow){
				System.out.print(arrayElement);
				System.out.print("    ");
			}
			System.out.println();
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
		FCFS object=new FCFS();
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Number of Job :  ");
		int jobLength=scannerObject.nextInt();
		int arrival_time[]=new int[jobLength];
		int job_size[]=new int[jobLength];
		arrival_time=object.inputArrayElements(arrival_time, jobLength);		//Input First Array
		job_size=object.inputArrayElements(job_size, jobLength);	//Input Second Array
		int result[][]=object.checkFCFS(arrival_time,job_size);
		object.displayArray(result);									//To Display Result
		scannerObject.close();
	}
}
