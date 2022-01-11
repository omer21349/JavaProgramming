package day34_GarbageCollection_AcsessModifiers;

public class CydeoStudent {
    public String name;
    public char gender;
    public int batchNumber,groupNumber;
    public static String schoolName,fieldOfStudy,programmingLanguage,secretCode;

    public CydeoStudent(String name, char gender, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    static {
        schoolName="cydeo";
        fieldOfStudy="it company";
        programmingLanguage="java";
        secretCode="work work work";
    }
    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printSecretCode(){
        System.out.println(secretCode);
    }
    public void attendClass(){
        System.out.println(name+" attending class");
    }
    public void study(){
        System.out.println(name+" studying");
    }
}
/*
create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */