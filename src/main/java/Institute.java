package educationalinstitute;

public class Institute {

    
    
    Student student;
    Instructor ins;
    Admin admin;
    
    /*Constructor (Aggregation)*/
    
    public Institute(Student student, Instructor ins, Admin admin) {
        this.student = student;
        this.ins = ins;
        this.admin = admin;
    }
    
    
}
