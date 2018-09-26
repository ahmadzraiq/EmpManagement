package EmpManagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpManagement {
    public static void printListOfAdditions(Person x) 
    {
    	Scanner read =new Scanner (System.in);	
    	System.out.println("Enter your id");
    	x.setId(read.nextInt());
        System.out.println("Enter your name = ");
        x.setName(read.next());
        System.out.println("Enter your age = ");
        x.setAge(read.nextFloat());
        System.out.println("Enter your data = ");
        x.setDateOfEmployment(read.nextFloat());
        System.out.println("Enter your salary = ");
        x.setSalary(read.nextDouble());
    }
    public static void printInfoList() 
    {
		 System.out.println("1 - Print everyone");
		 System.out.println("2 - Print Private Person id");
		 System.out.println("0 - Go back");
    }

    public static void main(String[] args) {
        ArrayList<Person> people= new ArrayList<Person>();
        Scanner read =new Scanner (System.in);
        Manager manager = new Manager();
        Employee employee = new Employee();
         try {
        	 int c=-1;
        	 while(c !=0)
        	 {	 
                 System.out.println("1 - Add employee");
                 System.out.println("2 - öAdd manager");
                 System.out.println("3 - Print information");
                 System.out.println("4 - Printing salary increase");
                 c=read.nextInt();
        	 switch (c)
        	 { 
        	 case 1:
        		 EmpManagement.printListOfAdditions(employee);
        		 people.add(employee);
        		 break;
        	 case 2:
        		 EmpManagement.printListOfAdditions(manager);
        		 people.add(manager);
        		 break;
        	 case 3:
        		 int q=-1;
        		 while(q !=0)
        		 {
            		 System.out.println("1 - Print employee information");
            		 System.out.println("2 - Print manager information");
            		 System.out.println("0 - Go back");
            		 q=read.nextInt();
        			 switch(q) 
        			 {
        			 case 1:
        				int b=-1;
        				 while(b !=0) 
        				 {	
        					 EmpManagement.printInfoList();
            				 b=read.nextInt();
        					 switch(b)
        					{
        					 case 1:    						 
    	        	             for(int i=0;i<people.size();i++)
    	        	             {
    	        	            	 Person person = people.get(i);
    	        	            	 if(person instanceof Employee)
    	        	            	 people.get(i).printInfo();	 
    	        	             }
    	        	             break;
        					 case 2:
        						 System.out.println("Enter ID = ");
        						 int id=read.nextInt();
        						 for(int i=0;i<people.size();i++)
        						 {
    	        	            	 Person person = people.get(i);
    	        	            	 if(person instanceof Employee) 
    	        	            		 if(people.get(i).id==id)
    	        	            			 people.get(i).printInfo();
    	        	            			 
        						 }
        						 break;
        					 case 0: b=0;
        					 	 break;	 
        					}
        				 }
        				break;
        			 case 2:
        				 int e =-1;
        				 while(e !=0) 
        				 {	
        					 EmpManagement.printInfoList();
            				e=read.nextInt();
        					 switch(e)
        					{
        					 case 1:    						 
    	        	             for(int i=0;i<people.size();i++)
    	        	             {
    	        	            	 Person person = people.get(i);
    	        	            	 if(person instanceof Manager)
    	        	            	 people.get(i).printInfo();
    	        	             }
    	        	             break;
        					 case 2:
        						 System.out.println("Enter ID = ");
        						 int id=read.nextInt();
        						 for(int i=0;i<people.size();i++)
        						 {
    	        	            	 Person person = people.get(i);
    	        	            	 if(person instanceof Manager) 
    	        	            		 if(people.get(i).id==id)
    	        	            			 people.get(i).printInfo();
    	        	            			 
        						 }
        						 break;
        					 case 0:e=0;
        					 break;
        				 
        					}
        				 }
        				 break;
        			 case 0: 
        				 q=0;
        			 	break;
        				 
        			 }
        		 }
        		 break;
        	 case 4:
        		int v=-1;
        		while(v !=0)
        		{
			 		System.out.println("1 - Print employee salary bonus");
					System.out.println("2 - Print manager salary bonus");
					System.out.println("0 - Back to the main menu");
     				v=read.nextInt();
     				switch(v) 
     				{
     				case 1:
     					int p=-1;
     					while(p !=0)
     					{
     						EmpManagement.printInfoList();
     						p=read.nextInt();
     						switch(p) 
     						{
     						case 1:
     						for(int i=0;i<people.size();i++)
     						{	
	        	            	 Person person = people.get(i);
	        	            	 if(person instanceof Employee)
	        	            	 people.get(i).printSalaryAfterTheAddition();
     						}
     							break;
     						case 2:
       						 System.out.println("Enter ID = ");
       						 int id=read.nextInt();
       						 for(int i=0;i<people.size();i++)
       						 {
   	        	            	 Person person = people.get(i);
   	        	            	 if(person instanceof Employee) 
   	        	            		 if(people.get(i).id==id)
   	        	            			 people.get(i).printSalaryAfterTheAddition();
   	        	            			 
       						 }
     							break;
     						}
     					}
     				case 2:
     					int t=-1;
     					while(t !=0)
     					{
     						EmpManagement.printInfoList();
     						t=read.nextInt();
     						switch(t) 
     						{
     						case 1:
     						for(int i=0;i<people.size();i++)
     						{
	        	            	 Person person = people.get(i);
	        	            	 if(person instanceof Manager)
	        	            	 people.get(i).printSalaryAfterTheAddition();
     						}
     					
     							break;
     						case 2:
          						 System.out.println("Enter ID = ");
           						 int id=read.nextInt();
           						 for(int i=0;i<people.size();i++)
           						 {
       	        	            	 Person person = people.get(i);
       	        	            	 if(person instanceof Manager) 
       	        	            		 if(people.get(i).id==id)
       	        	            			 people.get(i).printSalaryAfterTheAddition();
       	        	            			 
           						 }
     							break;
     						}
     					}
     					break;
     				case 0:v=0;
     					break;
     				}
        		}
        		break;
			 }
        	 
        	 }
        	 
         }
       
         
        catch(InputMismatchException e){
            System.out.println("Characters were entered in place of digits or vice versa. Make sure the information is correct");
        }
         
          
         }  
    }
    

