package EmpManagement;


public abstract class EmpManager {
        String name;
    float aga;
    float data;
    float salary;
    float salarypls;
    public abstract void prsalarypls();
    public  void printinfo()
    {
        System.out.println("the name is = " + this.name);
        System.out.println("the aga is = " + this.aga);
        System.out.println("the data is = " + this.data);
        System.out.println("the salary is = " + this.salary);
        
        
    }
    
}
