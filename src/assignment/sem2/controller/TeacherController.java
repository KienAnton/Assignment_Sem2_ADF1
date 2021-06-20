package assignment.sem2.controller;

import assignment.sem2.entity.Teacher;
import assignment.sem2.model.TeacherModel;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherController {
    private TeacherModel teacherModel = new TeacherModel();
    public ArrayList<Teacher> list = teacherModel.findAll();
    private Scanner scanner = new Scanner(System.in);

    public void creat() {
        Teacher teacher = new Teacher();
        System.out.println("Please enter teacher roll number: ");
        teacher.setRollNumber(scanner.nextLine());
        System.out.println("Please enter teacher fullname: ");
        teacher.setFullName(scanner.nextLine());
        System.out.println("Please enter teacher email: ");
        teacher.setEmail(scanner.nextLine());
        System.out.println("Please enter teacher phone: ");
        teacher.setPhone(scanner.nextLine());
        if (teacherModel.save(teacher)) {
            System.out.println("Action susccess!");
        } else {
            System.out.println("Action fails");
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

    public void search() {
        System.out.println("Pleaet enter rollNumber to search: ");
        String rollNumber = scanner.nextLine();
        Teacher teacher = teacherModel.findById(rollNumber);
        if (teacher == null) {
            System.out.println("Not found!");
        }
        System.out.println("Found teacher with information: " + teacher.toString());
    }

    public void update() {
        System.out.println("Pleaet enter rollNumber to update: ");
        String rollNumber = scanner.nextLine();
        Teacher teacher = teacherModel.findById(rollNumber);
        if (teacher == null) {
            System.out.println("Not found!");
        } else {
            System.out.printf("Found student with information: %s\n", teacher.toString());
        }
        Teacher updateTeacher = teacherModel.findById(rollNumber);
        System.out.println("Please enter teacher fullname: \n");
        updateTeacher.setFullName(scanner.nextLine());
        System.out.println("Please enter teacher email: \n");
        updateTeacher.setEmail(scanner.nextLine());
        System.out.println("Please enter phone: \n");
        updateTeacher.setPhone(scanner.nextLine());
        if (teacherModel.update(rollNumber, updateTeacher)) {
            System.out.println("Update success");
        } else {
            System.err.println("Action fails!");
        }
    }


    public void delete() {
        System.out.println("Pleaet enter rollNumber to update: ");
        String rollNumber = scanner.nextLine();
        Teacher teacher = teacherModel.findById(rollNumber);
        if (teacher == null) {
            System.out.println("Not found!");
        } else {
            System.out.printf("Found teacher with information: %s\n", teacher.toString());
            System.out.println("Are you sure delete?");
            System.out.println("Select 1 to delete");
            System.out.println("Choose 0 to go back");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    if (teacherModel.delete(rollNumber)) {
                        System.out.print("Delete teacher success!\n");
                    } else
                        System.err.println("Acction fails");
                    break;
                case 0:
                    break;
            }
        }
    }

}
