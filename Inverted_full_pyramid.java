import java.util.Scanner;
public class Inverted_full_pyramid{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int m=1,k,i,j;
  for ( i = n; i >= 1; i--)  
    {  
          
        for ( j = 1; j <= m; j++)  
        {  
            System.out.print(" "); // print the space  
        }  
      
        for ( k = 1; k <= ( 2 * i - 1); k++)  
        {  
            System.out.print("*"); // print the Star  
        }  
        m++;  
       System.out.println();  
    }  
}
}