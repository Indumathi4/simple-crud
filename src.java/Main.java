import service.StudentService;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        StudentService service=new StudentService();
        java.util.Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n---Student CRUD Application---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Enter choice");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                System.out.print("Enter name: ");
                String name=sc.next();

                System.out.print("Enter age: ");
                int age=sc.nextInt();
                service.addStudent(name,age);   
                break;
                
                case 2:
                service.viewStudents();
                break;
                
                case 3:
                System.out.print("Enter student ID to update: ");
                int updateId=sc.nextInt();
                
                System.out.print("Enter new name: ");
                String newName=sc.next();
                
                System.out.print("Enter new age: ");
                int newAge=sc.nextInt();

                service.updateStudent(updateId, newName, newAge);
                break;
                
                case 4:
                System.out.print("Enter student ID to delete: ");
                int deleteId=sc.nextInt();
                
                service.deleteStudent(deleteId);
                break;

                case 5:
                System.out.println("Exiting...");
                break;
                default:
                System.out.println("Invalid choice! Try again.");
                    break;
            }
            
        }while ( choice != 5); 
                
            sc.close();
    }
    
}
