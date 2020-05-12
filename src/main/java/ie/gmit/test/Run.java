package ie.gmit.test;

import java.util.ArrayList;

import ie.gmit.Programme;
import ie.gmit.Student;
import ie.gmit.Module;
import ie.gmit.Grades;
import org.joda.time.DateTime;

public class Run {

    public static void main(String[] args){}

    //Creating Students and adding them to the list of students
    ArrayList<Student> Students = new ArrayList<~>();
    Student Peter = new Student("Peter Treacy", "13/05/1995", 25);
    Student Nicola = new Student("Nicola Costello","12/4/1996",24);
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
    Module CloudComputing = new Module("Cloud Computing","CC101");
    Module Maths = new Module("Mathematics", "MA203");
    Module BioMedScience = new Module("Biomedical Science", "BS511");
    Module BusinessInfo = new Module("Business Information Systems", "B1222");
    Module SoftwareEng = new Module("Software Engineering with Test", "SE333");
    Module MobileAppDev = new Module("Mobile App Development", "MAD987");

    //Adding students to modules
    CloudComputing.addStudent(Peter);
    CloudComputing.addStudent(Dean);

    Maths.add(Dean);
    Maths.add(Tim);

    BioMedScience.add(Megan);

    BusinessInfo.add(John);

    SoftwareEng.add(Nicola);

    MobileAppDev.add(Peter);

    //Creating new courses
    Programme IT = new Programme("Software Development & Electronic Engineering",new DateTime());


    //adding modules to the course programme
    IT.addModule(CloudComputing);
    IT.addModule(Maths);
    IT.addModule(SoftwareEng);
    IT.addModule(MobileAppDev);

    Peter.addGrade(CloudComputing) = "A";


    Peter.setProgramme(IT);

    System.out.println("List of students and their results");

    for(Student s : Students){
        System.out.println(s.toString());
        System.out.println(s.getProgramme().toString());

        System.out.println("List of results");
        for(Module mod:s.getProgramme().getModules())
        {
            if(mod.getStudents().contains(s)){
                System.out.println(mod.toString());

            }
        }
        System.out.println("\n");
    }


}
