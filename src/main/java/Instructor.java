package educationalinstitute;


public class Instructor {
    
    private String name;
    private Integer office_hrs;
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setOffice_hrs(Integer office_hrs)
    {
        this.office_hrs = office_hrs;
    }
    
    public Integer getOffice_hrs()
    {
        return office_hrs ;
    }
    
    public String getSub(Subject subs)
    {
        return subs.getName();
    }
}
