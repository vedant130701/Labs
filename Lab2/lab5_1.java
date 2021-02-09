import java.util.Scanner;
import java.util.Calendar; 
import java.util.GregorianCalendar; 
// class Date{
//     int day;
//     int month;
//     int year;
    
// }
class Student{
    static int count = 0;
    int reg_no;
    String name;
    //Date doj = new Date();
    GregorianCalendar doj = new GregorianCalendar();
    short sem;
    float GPA;
    float CGPA;
    int cnt;
    
    Student(){
        reg_no = 0;
        name = "";
        // doj.day = 0;
        // doj.month = 0;
        // doj.year = 0;
        sem = 0;
        GPA = 0;
        CGPA = 0;
        count++;
        cnt = count;
    }
    Student(int day, int month, int year, String FullName, short semester, float gpa, float cgpa ){
        // doj.day=day;
        // doj.month=month;
        // doj.year=year;
        name = FullName;
        sem = semester;
        GPA = gpa;
        CGPA = cgpa;
        // int reg_yr = year%100;
        int reg_yr = doj.get(Calendar.YEAR)%100;
        count++;
        cnt = count;
        reg_no = 100*reg_yr+count;
    }
    void display(){
        System.out.println("--------------------------------");
        System.out.println("Name of the student:"+name);
        //System.out.println("Date of joining:"+doj.day+"/"+doj.month+"/"+doj.year);
        System.out.println("Date of joining:"+doj.get(Calendar.DATE));
        System.out.println("Registration number:"+reg_no);
        System.out.println("Semester:"+sem);
        System.out.println("GPA:"+GPA);
        System.out.println("CGPA:"+CGPA);
        System.out.println("--------------------------------");
    }
}

public class lab5_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student stud[] = new Student[5];
        int i,day,month,year, n=2;
        String FullName;
        short semester;
        float gpa,cgpa;
        for(i=0;i<n;++i){
            System.out.println("Enter details of student "+(i+1)+":");
            System.out.print("Name:");
            FullName = sc.nextLine();
            System.out.println();
            System.out.print("Day of joining:");
            day = sc.nextInt();
            System.out.println();
            System.out.print("Month of joining:");
            month = sc.nextInt();
            System.out.println();
            System.err.print("Year of joining:");
            year = sc.nextInt();
            System.out.println();
            System.out.print("Semester:");
            semester = sc.nextShort();
            System.out.println();
            System.out.print("Enter GPA:");
            gpa = sc.nextFloat();
            System.out.println();
            System.out.print("Enter CGPA:");
            cgpa = sc.nextFloat();
            stud[i] = new Student(day,month,year,FullName,semester,gpa,cgpa);
            System.out.println();
        }
        for(i=0;i<n;++i){
            stud[i].display();
        }
    }
}

