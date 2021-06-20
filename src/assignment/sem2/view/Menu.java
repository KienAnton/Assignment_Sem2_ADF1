package assignment.sem2.view;

import assignment.sem2.controller.StudentController;
import assignment.sem2.controller.TeacherController;

import java.util.Scanner;

public class Menu {
    private StudentController studentController = new StudentController();
    private TeacherController teacherController = new TeacherController();
    private Scanner scanner = new Scanner(System.in);

    public Menu() {
    }

    public void generateStudentMenu(){
        while (true){
            System.out.println("Sudent mananger");
            System.out.println("--------------------------");
            System.out.println("1. Create new.");
            System.out.println("2. Show list.");
            System.out.println("3. Search.");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Menu");
            System.out.println("0. Exit Program.");
            System.out.println("--------------------------");
            System.out.println("Please enter your choice (0-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    studentController.create();
                    break;
                case 2:
                    studentController.showList();
                    break;
                case 3:
                    studentController.search();
                    break;
                case 4:
                    studentController.upddate();
                    break;
                case 5:
                    studentController.delete();
                case 6:
                    generateMenu();
                    break;
                case 0:
                    System.out.println("Bye bye");
                    break;
                default:
                    break;
            }
            if (choice == 0){
                break;
            }
        }
    }

    public void generateTeacherMenu(){
        while (true){
            System.out.println("Teacher mananger");
            System.out.println("----------------------------");
            System.out.println("1. Create new.");
            System.out.println("2. Show list.");
            System.out.println("3. Search.");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Menu");
            System.out.println("0. Exit Program.");
            System.out.println("-----------------------------");
            System.out.println("Please enter your choice (0-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    teacherController.creat();
                    break;
                case 2:
                    teacherController.showList();
                    break;
                case 3:
                    teacherController.search();
                    break;
                case 4:
                    teacherController.update();

                    break;
                case 5:
                    teacherController.delete();
                case 6:
                    generateMenu();
                    break;
                case 0:
                    System.out.println("Bye bye");
                    break;
                default:
                    break;
            }
            if (choice == 0){
                break;
            }
        }
    }

    public void generateMenu(){
        while (true){
            System.out.println("\t\tMenu");
            System.out.println("----------------------------");
            System.out.println("1. Mananger student.");
            System.out.println("2. Mananger teacher.");
            System.out.println("0. Exit");
            System.out.println("----------------------------");
            System.out.println("Please enter your choice (0-2): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    generateStudentMenu();
                    break;
                case 2:
                    generateTeacherMenu();
                    break;
                case 0:
                    System.out.println("Bye bye");
                    break;
                default:
                    break;
            }
            if (choice == 0){
                break;
            }
        }
    }
}
