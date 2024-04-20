import java.util.Scanner;
public class skip_no{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int m = scanner.nextInt();
Scanner scanners = new Scanner(System.in);
int n = scanners.nextInt();
int i;
int k=7;
if(m>n){
System.out.println("Invalid");
}
else{
for(i=m;i<=n;i+=k+1){
System.out.println(i);
}
}
}}

