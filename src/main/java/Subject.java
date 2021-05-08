package educationalinstitute;

public class Subject {

    
    
    private String name ;
    private float grade;
    
    public Subject(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }
    
    public void setName(String name)
    {
        this.name = name ;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setGrade(float grade)
    {
        this.grade = grade;
    }
    
    public float getGrade()
    {
        return grade;
    }
}
