package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1= new Employee();
        employee1.setInfo("Omer",24345,"Cooking",100000,true);

        Employee employee2= new Employee();
        employee2.setInfo("Veli",73534,"SDET",120000,true);

        Employee employee3= new Employee();
        employee3.setInfo("Hasan",72344,"SDET",40000,false);

        Employee employee4= new Employee();
        employee4.setInfo("Fatma",23434,"Mecanic",60000,true);

        Employee employee5= new Employee();
        employee5.setInfo("Ayse",46564,"Server",20000,false);


        Employee employeeslist []={employee1,employee2,employee3,employee4,employee5};

        ArrayList<Employee>fullTime=new ArrayList<>(Arrays.asList(employeeslist));
        ArrayList<Employee>minSalary=new ArrayList<>();
        ArrayList<Employee>maxSalary=new ArrayList<>(Arrays.asList(employeeslist));
        int countFultime=0;
        int countPartTime=0;
        double maxEmployeeSalary=employeeslist[0].salary;
        double minEmployeeSalary=employeeslist[0].salary;
        for (Employee employee : employeeslist) {
            if(employee.isFullTime){
                countFultime++;
            }else {
                countPartTime++;
            }

        }
        System.out.println("countFultime = " + countFultime);
        System.out.println("countPartTime = " + countPartTime);
        for (Employee employee : employeeslist) {
            if(employee.salary>maxEmployeeSalary){
                maxEmployeeSalary=employee.salary;
            }
        }
        System.out.println("maxEmployeeSalary = " + maxEmployeeSalary);
        for (Employee employee : employeeslist) {
            if(employee.salary<minEmployeeSalary){
                minEmployeeSalary=employee.salary;
            }
        }
        System.out.println("minEmployeeSalary = " + minEmployeeSalary);


    }
}
