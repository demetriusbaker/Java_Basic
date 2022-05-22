package ExampleClasses;

import java.util.Comparator;

public class Student{
    private String name;
    private int course, group;

    public Student(String name, int course, int group){
        this.name = name;
        this.course = course;
        this.group = group;
    }

    public String getName(){
        return name;
    }

    public int getCourse(){
        return course;
    }

    public int getGroup(){
        return group;
    }

    public String toString(){
        return "{Student: " + name + " course: " + course + " group " + group + "}";
    }

    public static class SortByName implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }

    public static class SortByCourse implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getCourse() - s2.getCourse();
        }
    }

    public static class SortByGroup implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getGroup() - s2.getGroup();
        }
    }
}