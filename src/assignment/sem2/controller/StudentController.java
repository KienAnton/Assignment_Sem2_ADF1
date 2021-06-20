package assignment.sem2.controller;

import assignment.sem2.entity.Student;
import assignment.sem2.model.StudentModel;
import sun.font.DelegatingShape;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private StudentModel studentModel = new StudentModel();
    public ArrayList<Student> list = studentModel.findAll();
    private Scanner scanner = new Scanner(System.in);
    // Viet ham create, yeu cau nguoi dung nhap vao thong tin sinh vien.
    // Tra ve thong tin sinh vien vua nhap.

    public void create() {
        Student student = new Student();
        System.out.println("Please enter student rollNumber: ");
        String rollNumber = scanner.nextLine();
        student.setRollNumber(rollNumber);
        System.out.println("Please enter student fullName: ");
        String fullName = scanner.nextLine();
        student.setFullName(fullName);
        System.out.println("Please enter student email: ");
        String email = scanner.nextLine();
        student.setEmail(email);
        System.out.println("Please enter student phone: ");
        String phone = scanner.nextLine();
        student.setPhone(phone);
        if (studentModel.save(student)) {
            studentModel.save(student);
            System.out.println("Save success");
        } else {
            System.out.println("Save error");
        }

    }

    public void showList() {
        System.out.printf("%10s%10s%10s | %10s%15s%10s | %5s%20s%5s | %5s%10s%5s\n",
                "", "Rollnumber", "",
                "", "Fullname", "",
                "", "Email", "",
                "", "Phone", "");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    // tìm kiếm theo mã sinh viên, trả về thông tin sinh viên đó nếu có, còn nếu không
    // tìm thấy thì trả về null.
    public void search() {
        System.out.println("Please enter rollnumber to search: ");
        String rollNumber = scanner.nextLine();
        Student student = studentModel.findById(rollNumber);
        if (student == null) {
            System.out.println("Student is not found!\n");
        } else {
            System.out.printf("Found student with information: %s\n", student.toString());
        }
    }


    public void delete() {
        System.out.println("Please enter rollNumber to delete: ");
        String rollNumber = scanner.nextLine();
        Student student = studentModel.findById(rollNumber);
        if (student == null) {
            System.out.println("Student is not found!\n");
        } else {
            System.out.printf("Found student with information: %s\n", student.toString());
        }
        System.out.println("Are you sure delete?");
        System.out.println("Select 1 to delete");
        System.out.println("Choose 0 to go back");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                if (studentModel.delete(rollNumber)) {
                    System.out.printf("Delete student success!\n");
                } else
                    System.err.println("Acction fails");
                break;
            case 0:
                break;
        }
    }

    public void upddate() {
        System.out.println("Please enter rollNumber to update: ");
        String rollNumber = scanner.nextLine();
        Student student = studentModel.findById(rollNumber);
        if (student == null) {
            System.out.println("Student is not found!\n");
        } else {
            System.out.printf("Found student with information: %s\n", student.toString());
        }
        Student updateStudent = studentModel.findById(rollNumber);
        System.out.println("Please enter student full name:");
        updateStudent.setFullName(scanner.nextLine());
        System.out.println("Please enter student email:");
        updateStudent.setEmail(scanner.nextLine());
        System.out.println("Please enter student phone number:");
        updateStudent.setPhone(scanner.nextLine());
        if (studentModel.update(rollNumber, updateStudent)) {
            System.out.println("Update student is sucsess!");
        }else {
            System.err.println("Acction fails");
        }

    }
}
