package day37Inheritance.scrumTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id,  double salary, String companyName) {
        super(name, age, gender, id, "Product Owner ", salary, companyName);
    }
}
