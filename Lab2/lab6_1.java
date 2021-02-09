import java.util.Scanner;
class DOB{
    int day;
    int month;
    int year;

    void setDOB(int d,int m,int y){
        day = d;
        month = m;
        year = y;
    }
}
class Person{
    private String name;
    private DOB dob = new DOB();
    Person(){
        name = " ";
        dob.setDOB(0,0,0);
    }
    Person(int day, int month, int year, String Name){
        dob.setDOB(day,month,year);
        // dob.day = day;
        // dob.month = month;
        // dob.year = year;
        name = Name;
    }
    String getName(){
        return name;
    }
    DOB getDOB(){
        return dob;
    }

}

class CollegeGrad extends Person{
    private float GPA;
    private int year;
    CollegeGrad(){
        super();
        GPA = 0;
        year = 0;
    }
    CollegeGrad(int day, int month, int yearDOB, String Name, float GPA, int year){
        super(day,month,yearDOB,Name);
        this.GPA = GPA;
        this.year = year;
    }
    float getGpa(){
        return GPA;
    }
    int getYear(){
        return year;
    }

    void display(){
        System.out.println("Name = "+ getName());
        DOB dob = getDOB();
        System.out.println("DOB = "+ dob.day+"/"+dob.month+"/"+dob.year);
        System.out.println("GPA = "+getGpa());
        System.out.println("Year of graduation = "+ getYear());
    }

}

public class lab6_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details:");
        int day,month,yearDOB,year;
        String Name;
        float GPA;
        System.out.println("Enter name:");
        Name = sc.nextLine();
        System.out.println("Enter Day");
        day = sc.nextInt();
        System.out.println("Enter Month");
        month = sc.nextInt();
        System.out.println("Enter year");
        yearDOB = sc.nextInt();
        System.out.println("Enter GPA");
        GPA = sc.nextFloat();
        System.out.println("Enter year of grad");
        year = sc.nextInt();
        CollegeGrad C = new CollegeGrad(day,month,yearDOB,Name,GPA,year);
        System.out.println(
            
        );
        C.display();
    }
}