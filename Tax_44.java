import java.util.Scanner;

public class Tax_44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks in four subjects
        System.out.println("Enter the income:");
        double income = scanner.nextDouble();
       double tax=0;
	if (income<0) { System.out.println("INVALID");}
	else if(income<150000){ tax=0; }
	else if (income>150000 && income<300000) { tax= 0.1*income; }
	else if (income>300000 && income<500000) { tax= 0.2*income; }
	else  { tax= 0.3*income; }

	System.out.println(tax);
	

       
    }
}
