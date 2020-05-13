package ie.gmit.test;


import java.util.ArrayList;
import java.lang.String;
import ie.gmit.Programme;
import ie.gmit.Student;
import ie.gmit.Module;
import ie.gmit.Grade;
import ie.gmit.Attendance;
import org.joda.time.DateTime;

public class Run {

    public static void main(String[] args) {

        //Creating Students and adding them to the list of students
        ArrayList<Student> Students = new ArrayList<Student>();
        Student Peter = new Student("Peter Treacy", "13/05/1995", 25);
        Student Nicola = new Student("Nicola Costello", "12/4/1996", 24);
        Student Megan = new Student("Megan Fitzgerald", "17/7/1994", 25);
        Student Dean = new Student("Dean Glavey", "03/03/1996", 24);
        Student John = new Student("John Lawless", "05/06/1990", 29);
        Student Tim = new Student("Tim Mahoney", "20/11/1995", 24);


        Students.add(Peter);
        Students.add(Nicola);
        Students.add(Megan);
        Students.add(Dean);
        Students.add(John);
        Students.add(Tim);


        //Creating list of modules
        ArrayList<Module> Modules = new ArrayList<Module>();
        Module CloudComputing = new Module("Cloud Computing", "CC101");
        Module Maths = new Module("Mathematics", "MA203");
        Module EmbeddedRTOS = new Module("Embedded Free RTOS", "BS511");
        Module EnterpriseIn = new Module("Enterprise and Innovation", "B1222");
        Module SoftwareEng = new Module("Software Engineering with Test", "SE333");
        Module MobileAppDev = new Module("Mobile App Development", "MAD987");

        //Adding students to modules
        CloudComputing.addStudent(Peter);
        CloudComputing.addStudent(Nicola);
        CloudComputing.addStudent(Megan);
        CloudComputing.addStudent(John);
        CloudComputing.addStudent(Dean);
        CloudComputing.addStudent(Tim);


        Maths.addStudent(Peter);
        Maths.addStudent(Nicola);
        Maths.addStudent(Megan);
        Maths.addStudent(John);
        Maths.addStudent(Dean);
        Maths.addStudent(Tim);

        EmbeddedRTOS.addStudent(Peter);
        EmbeddedRTOS.addStudent(Nicola);
        EmbeddedRTOS.addStudent(Megan);
        EmbeddedRTOS.addStudent(John);
        EmbeddedRTOS.addStudent(Dean);
        EmbeddedRTOS.addStudent(Tim);

        EnterpriseIn.addStudent(Peter);
        EnterpriseIn.addStudent(Nicola);
        EnterpriseIn.addStudent(Megan);
        EnterpriseIn.addStudent(John);
        EnterpriseIn.addStudent(Dean);
        EnterpriseIn.addStudent(Tim);

        SoftwareEng.addStudent(Peter);
        SoftwareEng.addStudent(Nicola);
        SoftwareEng.addStudent(Megan);
        SoftwareEng.addStudent(John);
        SoftwareEng.addStudent(Dean);
        SoftwareEng.addStudent(Tim);

        MobileAppDev.addStudent(Peter);
        MobileAppDev.addStudent(Nicola);
        MobileAppDev.addStudent(Megan);
        MobileAppDev.addStudent(John);
        MobileAppDev.addStudent(Dean);
        MobileAppDev.addStudent(Tim);


        //Creating course
        Programme SEE = new Programme("Software & Electronic Engineering", new DateTime(2019, 9, 5, 9, 0), new DateTime(2020, 5, 19, 17, 0));


        //adding modules to the course programme
        SEE.addModule(CloudComputing);
        SEE.addModule(Maths);
        SEE.addModule(EmbeddedRTOS);
        SEE.addModule(EnterpriseIn);
        SEE.addModule(SoftwareEng);
        SEE.addModule(MobileAppDev);

        Peter.setProgramme(SEE);
        Nicola.setProgramme(SEE);
        Megan.setProgramme(SEE);
        Dean.setProgramme(SEE);
        John.setProgramme(SEE);
        Tim.setProgramme(SEE);

        ArrayList<Grade> Grades = new ArrayList<Grade>();
        Grade A = new Grade("A");
        Grade B = new Grade("B");
        Grade C = new Grade("C");
        Grade D = new Grade("D");
        Grade NG = new Grade("NG");

        A.addStudent(Peter);
        B.addStudent(Nicola);
        B.addStudent(Megan);
        C.addStudent(John);
        C.addStudent(Dean);
        D.addStudent(Tim);

        ArrayList<Attendance> Attendance = new ArrayList<>();
        Attendance Distinction = new Attendance("Distinction");
        Attendance Merit = new Attendance("Merit");
        Attendance Pass = new Attendance("Pass");


        System.out.println("List of students/GPA results/Average Attendance");
//

        for (Student student : Students) {
            System.out.println(student.toString());
            System.out.println(student.getProgramme().toString());

            System.out.println("---List of Modules----");
            for (Module module : student.getProgramme().getModules()) {
                if (module.getStudents().contains(student)) {
                    System.out.println(module.toString());
                }
            }
            System.out.println("\n");

            /*System.out.println("---GPA----");
        for (Grade grade : student.getStudent().getGrades()) {
            if (grade.getStudents().contains(student)) {
                System.out.println(grade.toString());
            }
        System.out.println("\n");*/

            /*System.out.println("---Attendance----");
        for (Attendance attendance : student.getStudent().getAttendance()) {
            if (attendance.getStudents().contains(student)) {
                System.out.println(attendance.toString());
            }
        System.out.println("\n");*/
            }

    }

}
