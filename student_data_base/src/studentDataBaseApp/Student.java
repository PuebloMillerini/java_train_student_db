package studentDataBaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;


    //Constructor

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println(" 1 - Freshman\n 2 - Sophmore\n 3 - Junior\n 4 - Senior\n Enter student grade level: ");
        this.gradeYear = in.nextInt();
        setStudentID();
    }
    //Generate an ID
    private void setStudentID(){
        //Grade year + static ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll(){
        //Get inside a loop , user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit) : ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance += costOfCourse;
            } else break;
        } while (1 != 0);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Balance is:" + tuitionBalance);
    }

    //Pay tuition

    public void payTuition(){
        viewBalance();
        System.out.print("Enter the payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        if(payment > tuitionBalance){
            int change = payment - tuitionBalance;
            tuitionBalance = 0;
            System.out.println("Thanks for your payment. Do not forget your change " + change);
        } else  {
            tuitionBalance -= payment;
            System.out.println("Thank for payment!");}

        viewBalance();
    }

    //Show status
    @Override
    public String toString(){
        return "Name: " + firstName + " " + "Last name " + lastName +" " + "Student ID: " + studentID +
                "\n" + "Courses enrolled: " + courses + "\n" + "Balance is:" + tuitionBalance;
    }

}
