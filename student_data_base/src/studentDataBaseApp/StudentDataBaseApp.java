package studentDataBaseApp;

import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {

        //How many users to add?
        System.out.print("Enter a number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        Student[] students = new Student[numStudents];

        //Create n number of new students
        for (int i = 0; i < numStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }


    }
}
