package lesson15.homework;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private List<Integer> rating;

    public Student(String name, int group, int course, List<Integer> rating) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageRating() {
        double sum = 0;
        for (double ratings : rating) {
            sum += ratings;
        }
        return sum / rating.size();
    }

    public static void checkRating(List<Student> students) {
        List<Student> toRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.getAverageRating() < 3) {
                toRemove.add(student);
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
        students.removeAll(toRemove);

    }
}

