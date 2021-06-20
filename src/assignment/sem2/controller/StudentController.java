package assignment.sem2.controller;
import assignment.sem2.entity.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    public ArrayList<Student> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    // Viet ham create, yeu cau nguoi dung nhap vao thong tin sinh vien.
    // Tra ve thong tin sinh vien vua nhap.

    public Student create() {
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
        list.add(student);
        return student;
    }

    public void showList() {
        System.out.printf("%10s%10s%10s | %10s%15s%10s | %5s%20s%5s | %5s%10s%5s\n",
                "", "Rollnumber", "",
                "", "Fullname", "",
                "", "Email", "",
                "", "Phone", "");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    // tìm kiếm theo mã sinh viên, trả về thông tin sinh viên đó nếu có, còn nếu không
    // tìm thấy thì trả về null.
    public void search() {
        System.out.println("Please enter rollnumber to search: ");
        String rollNumber = scanner.nextLine();
        int studentIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getRollNumber().equals(rollNumber)) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex == -1) {
            System.out.println("Student is not found!\n");
        } else {
            System.out.printf("Found student with information: %s\n", list.get(studentIndex).toString());
        }
    }


    public void delete() {
        System.out.println("Please enter rollNumber: ");
        String rollNumber = scanner.nextLine();
        int studentIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getRollNumber().equals(rollNumber)) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex == -1) {
            System.err.printf("Student is not found!\n");
        } else {
            System.out.printf("Found student with information : %s\n", list.get(studentIndex).toString());
        }
        System.out.println("Are you sure delete?");
        System.out.println("Select 1 to delete");
        System.out.println("Choose 0 to go back");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                list.remove(list.get(studentIndex));
                break;
            case 0:
                break;
        }
    }

    public void upddate() {
        System.out.println("Please enter rollNumber: ");
        String rollNumber = scanner.nextLine();
        int studentIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getRollNumber().equals(rollNumber)) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex == -1) {
            System.out.println("Student is not found!\n");
        } else {
            System.out.printf("Found student with informatin: %s\n", list.get(studentIndex).toString());
        }
        System.out.println("Please enter student full name:");
        list.get(studentIndex).setFullName(scanner.nextLine());
        System.out.println("Please enter student email:");
        list.get(studentIndex).setEmail(scanner.nextLine());
        System.out.println("Please enter student phone number:");
        list.get(studentIndex).setPhone(scanner.nextLine());
        System.out.println("Update student is sucsess!");
    }
}
