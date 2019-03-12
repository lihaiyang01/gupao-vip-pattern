package com.gupao.vip.pattern.prototype;

import com.gupao.vip.pattern.prototype.bean.Clazz;
import com.gupao.vip.pattern.prototype.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Clazz clazz1 = new Clazz();
        clazz1.setCode(1);
        clazz1.setName("1班");
        List<Student> list = new ArrayList<Student>();
        Student student1 = new Student();
        list.add(student1);
        clazz1.setStudents(list);
        //重构前
        Clazz clazz2 = new Clazz();
        clazz2.setCode(1);
        clazz2.setName("1班");
        List<Student> list2 = new ArrayList<Student>();
        Student student2 = new Student();
        list2.add(student2);
        clazz2.setStudents(list);
        System.out.println(clazz1.getStudents() == clazz2.getStudents());
        //重构后
        try {
            Clazz clazz3 = (Clazz) clazz1.clone();
            System.out.println(clazz1.getStudents() == clazz3.getStudents());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
