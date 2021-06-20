package assignment.sem2;

import assignment.sem2.controller.StudentController;
import assignment.sem2.entity.Student;
import assignment.sem2.view.StudentMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.list.add(new Student("A123", "Kien Nguyen Xuan", "kiencuong789@gmail.com", "0987999120"));
        studentController.list.add(new Student("A124", "Kien Nguyen Xuan", "kiennguyen789@gmail.com", "0987999123"));
        studentController.list.add(new Student("A125", "Kien Nguyen Xuan", "kienxuan789@gmail.com", "0987999122"));
        studentController.list.add(new Student("A126", "Kien Nguyen Xuan", "kienthanh789@gmail.com", "0987999121"));
        studentController.upddate();
        studentController.showList();


    }
}
