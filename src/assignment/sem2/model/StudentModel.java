package assignment.sem2.model;

import assignment.sem2.entity.Student;

import java.util.ArrayList;

public class StudentModel {
    private ArrayList<Student> list = new ArrayList<>();

    public boolean save(Student obj) {
        list.add(obj);
        return true;
    }

    public ArrayList<Student> findAll() {
        return list;
    }

    public Student findById(String id) {
        Student obj = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRollNumber().equals(id)) {
                obj = list.get(i);
                break;
            }
        }
        return obj;
    }

    public boolean update(String id, Student ubdateobj) {
        Student existingStudent = findById(id);
        if (existingStudent == null) {
            return false;
        }
        existingStudent.setFullName(ubdateobj.getFullName());
        existingStudent.setEmail(ubdateobj.getEmail());
        existingStudent.setPhone(ubdateobj.getPhone());
        return true;
    }

    public boolean delete(String id){
        Student existingStudent = findById(id);
        if (existingStudent == null) {
            return false;
        }
        list.remove(existingStudent);
        return true;
    }


}
