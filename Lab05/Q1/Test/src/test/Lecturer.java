package test;
public class Lecturer extends Person
{
    private String programme;

    public Lecturer(String Name, int ID, String programme)
    {
        super(Name, ID);
        this.programme=programme;
    }
    public void setPro(String programme)
    {
        this.programme=programme;
    }
    public String getProgramme()
    {
        return programme;
    }
}
