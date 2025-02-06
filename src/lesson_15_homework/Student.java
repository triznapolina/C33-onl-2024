package lesson_15_homework;

import java.util.ArrayList;
import java.util.Arrays;

//Task 3. Create a Student class containing the following characteristics – name, group, course,
//and subject grades. Create a collection containing objects of the Student class.
//Write a method that removes students with an average score <3. If the average
//score is >=3, the student is transferred to the next course. Additionally write a method
//printStudents(List<Student> students, int course), which gets the list of students and
//the course number. It also prints to the console the names of those students from the list who
//are enrolled in this course.
public class Student {

    private String fullName;
    private String groupName;
    private int courseNumber;
    private int[] gradeSubject;


    public Student(String fullName, String groupName, int courseNumber, int[] gradeSubject) {
        this.fullName = fullName;
        this.groupName = groupName;
        this.courseNumber = courseNumber;
        this.gradeSubject = gradeSubject;
    }


    public static boolean CheckGrades(int[] grades){
        float averageGrage = ((Arrays.stream(grades).sum()) / (float)grades.length);
        return averageGrage >= 3;
    }

    public static void deleteStudents(ArrayList<Student> students) {
        int i = 0;
        while (i < students.size()) {
            if (!CheckGrades(students.get(i).gradeSubject)) {
                students.remove(i);
            } else {
                students.get(i).courseNumber++;
                i++;
            }
        }
    }

    public static void printStudents(ArrayList<Student> students, int course){
        for (Student student : students) {
            if (student.courseNumber == course) {
                System.out.println(student.fullName);
            }
        }
    }

    public static void print(ArrayList<Student> students){
        for (Student student : students) {
            System.out.print(student.fullName+ " " + student.courseNumber + " ");
        }
        System.out.println();
    }

}
