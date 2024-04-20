import java.util.Scanner;
public class Vowel_count
{
public static void  main(String[] args)
{

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a sentence: ");
        String s = scanner.nextLine();

        System.out.println(s);
int i,count=0;
for(i=0;i<s.length();i++)
{
char ch = s.charAt(i);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
{
count=count+1;
}
}
System.out.println(count);

}
}