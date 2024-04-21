import java.util.Scanner;

public class Stud_teacher_56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input total number of users
        System.out.print("Total Users: ");
        int totalUsers = scanner.nextInt();
        
        // Input number of staff users
        System.out.print("Staff Users: ");
        int staffUsers = scanner.nextInt();
        
        // Calculate number of student users
        int studentUsers = totalUsers - staffUsers;
        
        // Calculate number of non-teaching staff users
        int nonTeachingStaff = staffUsers / 3;
        
        System.out.println("Student Users: " + studentUsers);
        System.out.println("Non-Teaching Staff Users: " + nonTeachingStaff);
    }
}
