// Java implementation to print the 
// half diamond star pattern 
import java.util.*; 

public class HalfDiamondPattern{ 

// Function to print the 
// half diamond star pattern 
public static void halfDiamondStar(int N) 
{ 
	int i, j; 

	// Loop to print the upper half 
	// diamond pattern 
	for (i = 0; i < N; i++) 
	{ 
		for (j = 0; j < i + 1; j++) 
			System.out.print("*"); 
		System.out.print("\n"); 
	} 

	// Loop to print the lower half 
	// diamond pattern 
	for (i = 1; i < N; i++) 
	{ 
		for (j = i; j < N; j++) 
			System.out.print("*"); 
		System.out.print("\n"); 
	} 
} 

// Driver Code 
public static void main(String[] args) 
{ 
	int N = 5; 

	// Function Call 
	halfDiamondStar(N); 
} 
} 

// This code is contributed by Rohit_ranjan 
