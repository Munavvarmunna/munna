import java.io.*;
import java.util.*;
class AgeNotWithinRangeException extends RuntimeException
{
    AgeNotWithinRangeException(String s)
    {
        super(s);
    }
}
class Student
{
    int rollno;
    String name;
    int age;
    String course;
    Student(int rollno,String name,int age,String course)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
        this.course=course;
    }
    void display()
    {
         System.out.println("roll Name Age Course");
      
         System.out.println(rollno+" "+name+" "+age+" " +course);
    }
}
class StudentDemo
{
    public static void main(String args[]) throws Exception
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Name");
        String name=s.next();
         
        System.out.println("Enter Age");
        int age=s.nextInt();
        if(age<15||age>21)
        {
            throw new AgeNotWithinRangeException("Age isn't within range,enter correct age");
        }
        
        System.out.println("Enter rollno");
        int rollno=s.nextInt();

        System.out.println("Enter course");
        String course=s.next();
        Student st=new Student(rollno,name,age,course);
        st.display();
    }
}
