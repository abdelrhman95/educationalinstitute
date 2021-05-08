package educationalinstitute;


public class Student {
    
    private String name;
    private Integer id;
    Subject subs;
    
    public String getName()
    {
        return name;
    }
    
   public void setName(String name)
    {
        this.name = name;
        
    }
    
   public void setID(Integer id)
    {
        this.id = id;
    }
    
    public Integer getID()
    {
        return id;
    }
    
   public float getGrade(Subject subs)
    {
        return subs.getGrade();
    }
    
    
}
