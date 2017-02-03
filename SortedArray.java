/*
 * Objective : This program checks whether Array is in Ascending Order or Descending Order or Unsorted.
 * Date :  17-01-2017
 */

import static org.junit.Assert.assertEquals;

public class SortedArray {
	
	//This Function Checks Order of Array
	public  int check(int arrayParameter[]) {
		int arrayLength=arrayParameter.length;
		int ascendingflag=0;
		int descendingflag=0;
		int resultflag;
		for(int index=0;index<(arrayLength-1);index++){
			if(arrayParameter[index]>arrayParameter[index+1]){
				ascendingflag=1;
				continue;
			}
			if(arrayParameter[index]<arrayParameter[index+1]){
				descendingflag=1;
				continue;
			}
		}
		if(ascendingflag==0){
			resultflag=1;
		}
		else
		if(descendingflag==0){
				resultflag=2;
		}
		else{
				resultflag=0;
			}
		return resultflag;
	}

	// This Function Display Array Value
	public  void showArrayValue(int arrayParameter[]){
				for(int arrayElement:arrayParameter){
					System.out.print(arrayElement+" ");
				}
	}
	
	//Main function
	public static void main(String[] args) {
			SortedArray object=new SortedArray();
			int firstArray[]={6,5,4,3,1,2,3,2};
			object.showArrayValue(firstArray); // To Display Array
			int flagResult=object.check(firstArray);
			if(flagResult==0){
				System.out.println("Unsorted ");
			}
			else
			if(flagResult==1){
					System.out.println("Ascending Order ");
			}
			else{
					System.out.println("Descending Order ");
				}
		}
}
