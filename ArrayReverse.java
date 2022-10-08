//fix the issues in the code

package HacktoberFest2022;

public class ArrayReverse {
//reverse function
	static void reverse(int a[], int n) 
	{ 
		int[] b = new int[n]; 
		int j = n; 
		
		for (int i = 0; i < n; i++) { 
			b[j - 1] = a[i]; 
			j = j - 1; 
		} 
		//display reverse order
		System.out.println("Reversed array is: \n"); 
		for (int p = 0; p < n; p++) { 
			System.out.println(b[k]); 
		} 
	} 
//main function
	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50}; 
		reverse(arr, arr.length); 
	} 
} 
