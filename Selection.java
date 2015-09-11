import java.io.*;
import java.util.*;
class Selection{
	public static void main(String args[]){
		int n,temp=0,smallest,f=0,i;
		System.out.println("Enter the Size of the array");
		Scanner size = new Scanner(System.in);
		n = size.nextInt(); 
		int array[] = new int[n];
		System.out.println("Enter the elements of the array");
		Scanner input = new Scanner(System.in);
		for(i=0;i<(array.length);i++){
			array[i] = input.nextInt();
		}
		for(int k=0;k<(array.length);k++){
			smallest = k;
			for(i=k+1;i<(array.length);i++){
				if(array[i]<array[smallest]){
					smallest = i;
				}
			}
			if (smallest != i){
				temp = array[k];
				array[k] = array[smallest];
				array[smallest] = temp;
			}
		}	
		System.out.println("After selection sort ");
		for(i=0;i<(array.length);i++){
			System.out.println(" "+array[i]);
		}
	}
}	