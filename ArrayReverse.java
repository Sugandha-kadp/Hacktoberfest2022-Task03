package HacktoberFest2022;

public class ArrayReverse {

	static void reverse(int arr[], int a) 
	{ 
		int[] b = new int[a]; 
		int j = a; 
		
		for (int i = 0; i < a; i++) { 
			b[j - 1] = arr[i];
			j = j - 1;
		} 
		System.out.println("Reversed array is: \n"); 
		for (int k = 0; k < a; k++) { 
			System.out.println(b[k]);
		} 
	} 

	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50}; 
		reverse(arr, arr.length); 
	} 
} 
