
package project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;



public class Employee {
        Scanner scan=new Scanner(System.in);
        public static int totalEmployee=0;
        public String name;
        public int id;
        public String designation;
        public double salary;
        public String phone;
        public String email;
        public String joiningDate;
        public Employee(){
            name="";
            designation="";
            salary=0.0;
            phone="";
            email="";
            joiningDate="";
        }
        public Employee(String n,int i,String d,double s,String p,String e,String j){
            name=n;
            id=i;
            designation=d;
            salary=s;
            phone=p;
            email=e;
            joiningDate=j;
        }
        int i=0;
       Employee[] employeeList=new Employee[500];
       
        public void addEmployee(String n, int idno,String d,double s,String p,String e,String j){
            BufferedWriter bw = null;
            
            if(i<500){
                try{
                    
                 bw = new BufferedWriter(new FileWriter("info.txt", true));
            employeeList[i]= new Employee(n,idno,d,s,p,e,j);
            i++;
            totalEmployee++;
            bw.write(n+" "+idno+" "+d+" "+s+" "+p+" "+e+" "+j);
            bw.newLine();
	     bw.flush();
            System.out.println("successfully added");
                System.out.println(totalEmployee);
                //System.out.println(employeeList[0].name);
            }
                catch(Exception ex){
                    System.out.println("file not found");
                }
            }
            else{
                System.out.println("can not add more employee"); 
            }
            
        }
        public void searchEmployeeById(int idNo){
            int j,flag=0;
            
                    
                for(j=0;j<totalEmployee;j++){
                    if(employeeList[j].id==idNo){
                        flag=1;
                        System.out.println(employeeList[j].name);
                        System.out.println(employeeList[j].designation);
                        System.out.println(employeeList[j].id);
                        System.out.println(employeeList[j].salary);
                        System.out.println(employeeList[j].phone);
                        System.out.println(employeeList[j].email);
                        System.out.println(employeeList[j].joiningDate);
                        
                    }
                    
                }
                    if(flag==0){
                        System.out.println("employee not found");
                        
                       
                    }
                    
                }
        
        public void searchEmployeeByName(String n){
            int j=0,flag=0;
            
                for(j=0;j<totalEmployee;j++){
                   // System.out.println(employeeList[j].name);
                    if(employeeList[j].name.equals(n)){
                        flag=1;
                        System.out.println(employeeList[j].name);
                        System.out.println(employeeList[j].designation);
                        System.out.println(employeeList[j].id);
                        System.out.println(employeeList[j].salary);
                        System.out.println(employeeList[j].phone);
                        System.out.println(employeeList[j].email);
                        System.out.println(employeeList[j].joiningDate);
                        
                    }
                    
                }
                    if(flag==0){
                        System.out.println("employee not found");
                        
                       
                    }
                    
                }
        public void updateInfo(int idno){
            int j=0,flag=0;
            
                for(j=0;j<totalEmployee;j++){
                    if(employeeList[j].id==idno){
                        flag=1;
          System.out.println("enter name");
        String n=scan.next();
            System.out.println("enter designation");
        String d=scan.next();
              System.out.println("enter salary");
            double s=scan.nextDouble();
            System.out.println("enter phone");
        String p=scan.next();
            System.out.println("enter email");
        String em=scan.next();
            System.out.println("enter joining date");
        String jo=scan.next();
                        employeeList[j].name=n;
                        employeeList[j].designation=d;
                        employeeList[j].salary=s;
                        employeeList[j].phone=p;
                        employeeList[j].email=em;
                        employeeList[j].joiningDate=jo;
                        
                        System.out.println("successfully updated");
                        //System.out.println(employeeList[j].name);
                                
                    }
                    
                }
                    if(flag==0){
                        System.out.println("employee not found");
                        
                       
                    }
                    
        }
        public void deleteInfo(int idNo){
             int j,flag=0;
             int k=totalEmployee;
                for(j=0;j<totalEmployee;j++){
                    if(employeeList[j].id==idNo){
                        flag=1;
                        System.out.println(employeeList[j].name);
                        employeeList[j]=employeeList[j+1];    
                        totalEmployee=totalEmployee-1;
                       
                    }
                    if(flag==1 && totalEmployee==(k-1)){
                     
                         employeeList[j]=employeeList[j+1];
                     
                    }
                    
                }
               //System.out.println(employeeList[1].name);
                    if(flag==0){
                        System.out.println("employee not found");
                        
                       
                    }
        }
       public void maxSalary(){
        double max=0;
        int max_id=0;  
        for(int p=0;p<totalEmployee;p++){
            if(employeeList[p].salary>max){
                max=employeeList[p].salary;
                max_id=employeeList[p].id;
            }
        }   
        for(int j=0;j<totalEmployee;j++){
            if(employeeList[j].id==max_id){
                System.out.println("Designation:"+employeeList[j].designation+"has the maximun salary of "+max);   
            }
        }
        }
       public int countDesignation(String d){
           int count=0;
           for(int p=0;p<totalEmployee;p++){
               if(employeeList[p].designation.equals(d)){
                   count++;
               }
           }
           return count;
       }
        }
    
    

