import java.io.*;
import java.util.*;
class Bubble{
	public static void main(String args[]){
		int n,temp;
		System.out.println("Enter the Size of the array");
		Scanner size = new Scanner(System.in);
		n = size.nextInt(); 
		int array[] = new int[n];
		System.out.println("Enter the elements of the array");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<(array.length);i++){
			array[i] = input.nextInt();
		}
		for(int j=0;j<(array.length-1);j++){
			for(int i=0;i<(array.length-1);i++){
				if(array[i] > array[i+1]){
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		System.out.print("After Bubble sorting ");
		for(int i=0;i<(array.length);i++){
			System.out.print(" "+array[i]);
		}
	}
}