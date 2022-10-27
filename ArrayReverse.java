package HacktoberFest2022;
public class ArrayReverse {
	static void reverse(int x[], int n) 
	{ 
		int[] y = new int[n]; 
		int j = n; 
		
		for (int m = 0; m < n; m++) { 
			y[n - 1] = x[m]; 
			n = n - 1; 
		} 
		System.out.println("Reversed array is: \n"); 
		for (int q = 0; q < n; q++) { 
			System.out.println(y[k]); 
		} 
	} 
	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50}; 
		reverse(arr, arr.length); 
	} 
} 

