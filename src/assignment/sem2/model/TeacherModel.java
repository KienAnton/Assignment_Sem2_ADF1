package assignment.sem2.model;

import assignment.sem2.entity.Teacher;

import java.util.ArrayList;

public class TeacherModel {
    private ArrayList<Teacher> list;

    {
        list = new ArrayList<Teacher>();
        list.add(new Teacher("A123", "Kien Nguyen Xuan", "kiencuong789@gmail.com", "0987999120"));
        list.add(new Teacher("A124", "Kien Nguyen Xuan", "kiencuong789@gmail.com", "0987999120"));
    }


    public boolean save(Teacher obj) {
        list.add(obj);
        return true;
    }

    public ArrayList<Teacher> findAll() {
        return list;
    }

    public Teacher findById(String rollNumber) {
        Teacher obj = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRollNumber().equals(rollNumber)) {
                obj = list.get(i);
                break;
            }
        }
        return obj;
    }

    public boolean update(String id, Teacher updateobj) {
        Teacher existingTeacher = findById(id);
        if (existingTeacher == null) {
            return false;
        }
        existingTeacher.setFullName(updateobj.getFullName());
        existingTeacher.setEmail(updateobj.getEmail());
        existingTeacher.setPhone(updateobj.getPhone());
        return true;
    }

    public boolean delete(String id) {
        Teacher existingTeacher = findById(id);
        if (existingTeacher == null) {
            return false;
        }
        list.remove(existingTeacher);
        return true;
    }
}

