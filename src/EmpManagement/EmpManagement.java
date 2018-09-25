package EmpManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpManagement {


    public static void main(String[] args) {
                   
        ArrayList<EmpManager> Emp= new ArrayList<EmpManager>();
        Scanner read =new Scanner (System.in);
        
         try {
            int e=12121;
            
            while(e!=0)
            {
                
        System.out.println("Enter");
        System.out.println("1 - I am Manager");
        System.out.println("or");
        System.out.println("2 - I am Employee");
       
        int x=read.nextInt();
        if(x==1)
        {
             Manager le = new Manager();
             
             System.out.println("Enter your name = ");
             le.name=read.next();
             System.out.println("Enter your aga = ");
             le.aga=read.nextFloat();
             System.out.println("Enter your data = ");
             le.data=read.nextFloat();
             System.out.println("Enter your salary = ");
             le.salary=read.nextFloat();
             System.out.println("Enter your mp = ");
             le.mp=read.next();
            
             Emp.add(le);
             System.out.println("if you finsh input 0 or input 1");
             e=read.nextInt();
             
             
        }
        else
        if(x==2)
        {
             Employee em= new Employee();
             
             System.out.println("Enter your name = ");
             em.name=read.next();
             System.out.println("Enter your aga = ");
             em.aga=read.nextFloat();
             System.out.println("Enter your data = ");
             em.data=read.nextFloat();
             System.out.println("Enter your salary = ");
             em.salary=read.nextFloat();
             
             Emp.add(em);
             System.out.println("if you finsh input 0 or input 1");
             e=read.nextInt();
        }
        else
        
            System.out.println("error again enter");
       
            }
            
            int c=33;
            System.out.println("if you need print Manegeer intput 3");
            System.out.println("if you need print Empliyee intput 4");
            System.out.println("if you not input 0");
             
            c=read.nextInt();
            if(c ==3)
            {
                for(int i=0;i<Emp.size();i++)
                 {
                     EmpManager ee = Emp.get(i);
                     if (ee instanceof Manager)
                     
                     Emp.get(i).printinfo();
                     ((Manager)Emp.get(i)).printimp();
                     
                 }
            }
            else if(c==4)
            {
                
                for(int i=0;i<Emp.size();i++)
                 {
                     EmpManager ee = Emp.get(i);
                     if (ee instanceof Employee)
                     Emp.get(i).printinfo();
                 }  
            }  
            else if(c==0)
            {
                System.out.println("thanks");
            }    
         }

        catch(Exception e)
        {
            System.out.println("try again");
        }
         
}
    }
    

