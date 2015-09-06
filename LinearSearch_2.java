import java.util.Scanner;
import java.io.*;
import java.util.*;
class LinearSearch1{
	public static void main(String args[]){
		int array[] = new int[5];
		System.out.println("enter 5 numbers");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<(array.length);i++){
			array[i] = input.nextInt();
		}
		System.out.println("enter a number to search");
		Scanner search = new Scanner(System.in);
		int a = search.nextInt();
		for(int i=0;i<(array.length);i++){
			if(a == array[i]){
				System.out.println("number was found in the array");
				break;
			}
			if(a !=array[i] && i==(array.length-1)){
				System.out.println("number was not found in the array");	
			}
		}	
			
	}			
}	
	