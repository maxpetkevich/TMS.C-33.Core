package lesson15.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("----------Task 1----------------");
        UniqueList.getUniqueArray();
        System.out.println("\n----------Task 2----------------");
        getTaskTwo();
        System.out.println("\n----------Task 3----------------");
        getTaskThree();

    }
    public static void getTaskTwo(){
        Animals nameAnimal = new Animals();
        nameAnimal.addAnimal("Dog");
        nameAnimal.addAnimal("Rabbit");
        nameAnimal.addAnimal("Tiger");
        nameAnimal.printAnimal();
        nameAnimal.addAnimal("Fox");
        System.out.print("\nAfter add: ");
        nameAnimal.printAnimal();
        nameAnimal.deleteAnimal();
        System.out.print("\nAfter delete: ");
        nameAnimal.printAnimal();
        System.out.println();
    }
    public static void getTaskThree(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Maxim",2, 3, Arrays.asList(3,5,8)));
        students.add(new Student("Ivan",1, 1, Arrays.asList(2,1,3)));
        Student.checkRating(students);
        printStudents(students,4);
    }
    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("Name: " + student.getName() +", group: " + student.getGroup() + ", course: "+  student.getCourse() +", average rating: " + student.getAverageRating());
            }
        }
    }

}
