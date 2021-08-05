
package project;

import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        Employee e=new Employee();
        Scanner scn=new Scanner(System.in);
        int choice = 0;
        System.out.println("enter your choice: ");
        while(choice!=8){
        
        System.out.println("1.Add New Employee");
        System.out.println("2.Search an Employee By Id");
        System.out.println("3.Search an Employee By Name");
        System.out.println("4.Update information of an Employee");
        System.out.println("5.delete information of an Employee");
        System.out.println("6.Show maximum salary");
        System.out.println("7.Search total no of Employees by designation");
        System.out.println("8.exit");
        choice=scn.nextInt();
        
        if(choice==1){
            System.out.println("enetr name");
        String name=scn.next();
            System.out.println("enter id");
        int id=scn.nextInt();
            System.out.println("enter designation");
        String designation=scn.next();
            System.out.println("enetr salary");
        double salary=scn.nextDouble();
            System.out.println("enetr phone");
        String phone=scn.next();
            System.out.println("enter email");
        String email=scn.next();
            System.out.println("enter joining date");
        String joiningDate=scn.next();
            e.addEmployee(name,id,designation,salary, phone, email, joiningDate);
            
            
        }
        
        if(choice==2){
            System.out.println("enter id");
            int n=scn.nextInt();
            e.searchEmployeeById(n);
            
        }
        
        if(choice==3){
            System.out.println("enter name");
            String s=scn.next();
            e.searchEmployeeByName(s);
            
        }
    
        if(choice==4){
         System.out.println("enter the id");
        int idno=scn.nextInt();

        e.updateInfo(idno);
        
        }
        if(choice==5){
           System.out.println("enter the id");
           int idno=scn.nextInt();
           e.deleteInfo(idno);
           
        }
        if(choice==6){
            e.maxSalary();
        }
        if(choice==7){
            System.out.println("enter the designation");
            String s=scn.next();
            System.out.println("there are "+e.countDesignation(s)+s);
        }
        System.out.println("enter your choice: ");
    }
    }
}
