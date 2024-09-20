import java.util.*;
public class SchoolApp{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int choice;

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SchoolManagementApp sysAtt = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp sysGrade = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp sysLib = new LibrarySystemAdapter(librarySystem);

        System.out.println("Welcome to School App: ");

        do{
        System.out.println("\nPlease select from (1-3) to Integrate:");
        System.out.println("1: Attendance System");
        System.out.println("2: Grade System");
        System.out.println("3: Library System");
        System.out.println("4: Exit");
        System.out.print("Choose a Number: ");
        choice = scanner.nextInt();

        switch(choice){
            case 1:
                    sysAtt.integrateSystem();
                    break;

            case 2:
                    sysGrade.integrateSystem();
                    break;

            case 3:
                    sysLib.integrateSystem();
                    break;

            case 4:
                    System.out.println("Exiting the application. Thank you for using the School App");
                    break;

            default:
                    System.out.println("Invalid choice. Please enter a number between 1-4 and Try Again.");
            }
        } while (choice != 4);
            scanner.close();
    } 
}