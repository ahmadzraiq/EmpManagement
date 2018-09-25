package EmpManagement;


public class Employee extends EmpManager{
    
    public void prsalarypls()
    {
        float f=0.10f;
         
        this.salarypls=salary*f;
        
        System.out.println("The salarypls = "+salarypls);
        
    }

    
    
}
