package test;
public class Test
{
    public static void main(String[] args)
    {
        Lecturer lec = new Lecturer("Anne", 2001, "JAVA");
        System.out.println("Lecturer name is "+lec.getName());
        System.out.println("Lecturer id is "+lec.getID());
        System.out.println("Programme is "+lec.getProgramme());
        
        Student s = new Student("Henry", 5002, "Computer Science");
        System.out.println("Student name is "+s.getName());
        System.out.println("Student id is "+s.getID());
        System.out.println("Student course is "+s.getourse());
    }
    
}
