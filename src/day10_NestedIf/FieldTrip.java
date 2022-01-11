package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int num= 5;
        String b;

        if(num>=1&&num<=6){

            if (num==1){
                b="location -  Apple orchard\n" +
                        "number of groups - 3\n" +
                        "teacher in charge - Ms. Smith";
            }
            else if (num==2){
                b="location - Zoo\n" +
                        "number of groups - 7\n" +
                        "teacher in charge - Mr. Lee";
            }
            else if (num==3) {
                b ="location - Aquarium\n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Wilson";
            }
            else if (num==4) {
                b = "location - Movie theater  \n" +
                        "number of groups - 2\n" +
                        "teacher in charge - Ms. Reyes";
            }
            else if (num==5) {
                b = "location - Museum \n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Lela";
            }
            else {
                b = "location - Six Flags\n" +
                        "number of groups - 8\n" +
                        "teacher in charge - Mr. Watt\n";
            }


        }
        else{
            b="wrong number";
        }
        System.out.println(b);



    }
}




/*
Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt

 */
