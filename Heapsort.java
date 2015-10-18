import java.io.*;
import java.util.*;
class Heap{
	int array[] = new int[10];
	int heap_size;
	void Max_Heapify(int[] array,int i){
		int largest;
		int l = 2*i+1;
		int r = 2*i+2;
		if (l<heap_size && array[l]>array[i])
			largest = l;
		else
			largest = i;
		if (r<heap_size && array[r]>array[largest])
			largest = r;
		if (largest != i){
			int temp = array[i];
			array[i] = array[largest];
			array[largest] = temp;			
			Max_Heapify(array,largest);
		}
	}
	void Build_Heap(int[] array){
		heap_size = array.length;
		for(int j = array.length/2;j>=0;j--){
				Max_Heapify(array,j);
		}
	}
	void Heap_Sort(int[] array){
		Build_Heap(array);
		for(int i=array.length-1;i>=0;i--){
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heap_size = heap_size-1;
			Max_Heapify(array,0);
		}
	}
	void Print_after_HeapSort(){
		System.out.println("The sorted array  is ");
		for(int j=0;j <(array.length);j++){
			System.out.println(" "+array[j]);
		}
	}
	int Return_Max(int[] array){
		Max_Heapify(array,0);
		return array[0];
	}
}
class Heapsort{
	public static void main (String args[]){
		Heap heap = new Heap();
		System.out.println("Enter 10 numbers");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<(heap.array.length);i++){
			heap.array[i] = input.nextInt();
		}
		heap.Heap_Sort(heap.array);
		heap.Print_after_HeapSort();
		System.out.println("The Max number is "+heap.Return_Max(heap.array));
	}
}