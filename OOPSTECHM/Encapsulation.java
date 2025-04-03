package OOPSTECHM;

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        
        // Workers work = new Workers("Nani" ,  23, 45000.32, "ECE");
        Workers w = new Workers();

        Workers w1 = new Workers("Jhony" , 23 , 32455.00 , "CSE");

        w.setName("Nani");
        w.setAge(21);
        w.setSalary(23774.43);
        w.setDept("CSE");

        System.out.println(w1.getName());
        //Get all  data from the workers with the help of loop
        

        //Get all data from the w1



        // System.out.println();

        // Scanner sc = new Scanner(System.in);;

        // String get = sc.nextLine();

        // w.setName(get);

        // System.out.println("Enter the name " + get);
        // System.out.println(w.name);
        
        
    }
}

class Workers {
    String name;
    int age;
    double salary;
    String department;


    public Workers(String name,  int age, double salary, String department){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age =  age;
    }
    
    public String getDept( ){
        return department;

    }

    public void setDept(String department){
        this.department = department;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public Workers(){
        super();

    }

}
