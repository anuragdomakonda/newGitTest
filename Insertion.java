import java.io.*;
import java.util.*;
class Insertion{
	public static void main(String args[]){
		int array[] = new int[5];
		int key;
		int temp_2;
		System.out.println("Enter 5 numbers");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<(array.length);i++){
			array[i] = input.nextInt();
		}
		for(int i=1;i<(array.length);i++){
			key = array[i];
			for(int j = i-1;j>=0;j--){
				if(key < array[j]){
					temp_2 = array[j];
					array[j] = key;
					array[j+1] = temp_2;	
				}
				else 
					break;
			}
		}
		System.out.print("the sorted array is ");
		for(int i=0;i<(array.length);i++){
			System.out.print(" "+array[i]);
		}	
	}
}