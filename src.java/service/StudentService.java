package service;
import model.Student;
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students=new ArrayList<>();
    private int nextId=1; 
    
    //Create
    public void addStudent(String name, int age){
        Student s=new Student(nextId++, name, age);
        students.add(s);
        System.out.println("student added: "+ s);

    }

     //Read
    public void viewStudents(){
        if (students.isEmpty()){
            System.out.println("No students found.");
        }else{
            for (Student s : students){
                System.out.println(s);
            }
        }
    }
    //update
    public void updateStudent(int id, String newName, int newAge){
        for (Student s : students){
            if (s.getId() == id){
                s.setName(newName);
                s.setAge(newAge);
                System.out.println("Updated: " + s);
                return;
            }
        }
        System.out.println("Student not found with ID: " + id);
    }

    //Delete
    public void deleteStudent(int id){
    boolean removed =students.removeIf(s -> s.getId() == id);
    if (removed) {
        System.out.println("student deleted.");
        
    }else{
        System.out.println("Student not found with ID: " + id);
    }
   
}
   

    
}
