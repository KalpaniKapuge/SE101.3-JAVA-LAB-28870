package test;
public class Person
{
    private String Name;
    private int ID;
    
    public Person(String Name, int ID)
    {
        this.Name=Name;
        this.ID=ID;
    }
    public void setName(String Name)
    {
         this.Name=Name;
    }
    public String getName()
    {
        return Name;
    }
    public void set(int ID)
    {
         this.ID=ID;
    }
    public int getID()
    {
        return ID;
    }
}
