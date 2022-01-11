package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1= new Employee("omer");

        System.out.println(employee1);

        Employee employee2=new Employee("yuliya",'F');
        System.out.println(employee2);

        Employee employee3=new Employee("olga",'F',"sdet");
        System.out.println(employee3);
    }
}
