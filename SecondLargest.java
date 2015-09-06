import java.io.*;
import java.util.*;
class SecondLargest{
	public static void main(String args[]){
		int array[] = new int[5];
		int large = 0;
		int SecondLarge = 0;
		System.out.println("enter 5 numbers");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<(array.length);i++){
			array[i] = input.nextInt();
		}
		for(int i=0;i<(array.length);i++){
			if(array[i]>large){
				SecondLarge = large;
				large = array[i];
			}	
			else{
				if(array[i]>SecondLarge){
					SecondLarge = array[i];
				}
			}
		}
		System.out.println("The largest number is "+ large);
		System.out.println("The second largest number is "+ SecondLarge);
	}
}