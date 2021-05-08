package educationalinstitute;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Subject sub = new Subject("Arabic",50.5f);
        
        Student st = new Student();
        st.setName("abdo");
        st.setID(15);
        
        Instructor ins1 = new Instructor();
        ins1.setName("ahmed");
        
        Admin adm = new Admin();
        
        Institute edu = new Institute(st,ins1,adm);
        
        System.out.println("student name is " + st.getName() + "grade is : " + st.getGrade(sub));
        System.out.println("instructor name is " + ins1.getName() + "subject is : " + ins1.getSub(sub));

        
    }
}
