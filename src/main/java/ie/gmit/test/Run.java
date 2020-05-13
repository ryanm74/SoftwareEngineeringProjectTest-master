package ie.gmit.test;


import java.util.ArrayList;
import java.lang.String;
import ie.gmit.Programme;
import ie.gmit.Student;
import ie.gmit.Module;
import ie.gmit.Grades;
import ie.gmit.Attendance;
import org.joda.time.DateTime;

public class Run<Students> {

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
        Module BioMedScience = new Module("Biomedical Science", "BS511");
        Module BusinessInfo = new Module("Business Information Systems", "B1222");
        Module SoftwareEng = new Module("Software Engineering with Test", "SE333");
        Module MobileAppDev = new Module("Mobile App Development", "MAD987");

        //Adding students to modules
        CloudComputing.addStudent(Peter);
        CloudComputing.addStudent(Dean);


        Maths.addStudent(Peter);
        Maths.addStudent(Dean);
        Maths.addStudent(Tim);


        //Creating new courses
        Programme SEE = new Programme("Software & Electronic Engineering", new DateTime(2019, 9, 5, 9, 0), new DateTime(2020, 5, 19, 17, 0));


        //adding modules to the course programme

        SEE.addModule(Maths);
        SEE.addModule(CloudComputing);
        SEE.addModule(Maths);
        SEE.addModule(SoftwareEng);
        SEE.addModule(MobileAppDev);


        //Grades  = new Grades("")
        //CloudComputing.addGrade(Peter) = "A";


        Peter.setProgramme(SEE);
        Nicola.setProgramme(SEE);
        Megan.setProgramme(SEE);
        Dean.setProgramme(SEE);
        John.setProgramme(SEE);
        Tim.setProgramme(SEE);


        System.out.println("List of students and their results");
//

        for (Student student : Students) {
            System.out.println(student.toString());
            System.out.println(student.getProgramme().toString());

            System.out.println("---List of Modules----");
            for(Module module:student.getProgramme().getModules())
            {
                if(module.getStudents().contains(student)){
                    System.out.println(module.toString());
                }
            }
            System.out.println("\n");
        }
    }

}
