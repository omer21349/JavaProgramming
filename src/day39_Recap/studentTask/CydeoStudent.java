package day39_Recap.studentTask;

public class CydeoStudent extends Student {
    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, "Cydeo");
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("invalid num: "+batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(batchNumber<=0){
            System.err.println("invalid num: "+batchNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        if(programmingLanguage==null||programmingLanguage.isEmpty()){
            System.err.println("invalid: "+programmingLanguage);
            System.exit(1);
        }
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void eat() {
        System.out.println(getName()+" is eating "+programmingLanguage);
    }

    public void drink() {
        System.out.println(getName()+" is drinking "+programmingLanguage);
    }

    public void sleep() {
        System.out.println(getName()+" is sleeping after study the "+programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + getStudentId()+
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
/*
CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty


						Override the eat, drink and sleep methods (programmingLanguage need to be included)

						Override the toString method:
								name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included


 */