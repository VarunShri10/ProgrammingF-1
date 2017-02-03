/*
 * Objective : This program convert Binary Number to Octal Number.
 * Date :  17-01-2017
 */
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class Binary {
	//To Calculate Power 
	public static int calculatePower(int base,int power)
	{
		int result=1;
		for(int index=0;index<power;index++)
		{
			result=result*base;
		}
		return result;
		
	}
	//This Function converts Binary Number to Octal
	 int convertBinaryToOctal(int number){
		int temperaryRemainder;
		int octal;
		int internalPowerIndex;
		int internalTemperaryRemainder;
		int externalPowerIndex=0;
		int octalResult=0;
		while(number!=0){
			temperaryRemainder=(number%1000);
			internalPowerIndex=0;
			octal=0;
			while(temperaryRemainder!=0)
			{
				internalTemperaryRemainder=(temperaryRemainder%10);
				octal= (octal+(internalTemperaryRemainder*Binary.calculatePower(2, internalPowerIndex)));
				temperaryRemainder=temperaryRemainder/10;
				internalPowerIndex++;
			}
			octalResult= (octalResult+octal*Binary.calculatePower(10, externalPowerIndex));
			externalPowerIndex++;
			number=number/1000;
		}
		return octalResult;
	}
	 
	 //To Display Octal number
	 public void display(int octalNumber){
		 System.out.println("Octal Number : "+octalNumber);
	 }
	
	 //Main function
	public static void main(String[] args) {
		Binary object=new Binary();
		Scanner scannerObject=new Scanner(System.in);
		int binaryInput=scannerObject.nextInt();
		int result= object.convertBinaryToOctal(binaryInput);
		object.display(result);				// To Display Result
		scannerObject.close();
	}
}
