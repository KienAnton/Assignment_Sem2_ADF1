package assignment.sem2.controller;

import assignment.sem2.entity.Teacher;
import assignment.sem2.model.TeacherModel;

import java.util.ArrayList;

public class TeacherController {
    private TeacherModel teacherModel = new TeacherModel();
    public ArrayList<Teacher> list = teacherModel.findAll();
}
