package com.company;

import ExampleClasses.Student;
import ExampleClasses.Student.*;
import java.util.Arrays;
import java.util.Comparator;

public class SimpleComparator {
    public static void show(){
        Student[] students = {
                new Student("Вася", 2, 3243),
                new Student("Петя", 3, 3212),
                new Student("Дима", 2, 1010),
                new Student("Миша", 1, 6475),
                new Student("Леша", 4, 2312),
                new Student("Артем", 4, 3256),
                new Student("Андрей", 1, 7696),
                new Student("Даник", 2, 1010),
                new Student("Ваня", 2, 1010)
        };

        for (var s : students)
            System.out.println(s);
        System.out.println("-----");

        Arrays.sort(students, new SortByName());

        for (var s : students)
            System.out.println(s);
        System.out.println("-----");

        Arrays.sort(students, new SortByCourse());

        for (var s : students)
            System.out.println(s);
        System.out.println("-----");

        Arrays.sort(students, new SortByGroup());

        for (var s : students)
            System.out.println(s);
        System.out.println("-----");

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (var s : students)
            System.out.println(s);
        System.out.println("-----");
    }
}