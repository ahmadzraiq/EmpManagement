package EmpManagement;


public class Manager extends EmpManager {

    public float z=0.15f;
     String mp;
    public void printimp()
    {
        
        System.out.println("the mp = " + mp );
    }
    public void prsalarypls()

    {
        this.salarypls=salary*z;
        System.out.println("The salarypls = "+salarypls);
    }
    

}