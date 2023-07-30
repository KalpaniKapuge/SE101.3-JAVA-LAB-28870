package test;
public class Student extends Person
{
    private String course;
    
    public Student(String Name, int ID, String course)
    {
        super(Name,ID);
        this.course=course;
    }
    public void setCourse(String course)
    {
       this.course=course;   
    }
    public String getourse()
    {
        return course;
    }
}
