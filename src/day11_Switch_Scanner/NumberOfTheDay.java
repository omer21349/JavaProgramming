package day11_Switch_Scanner;

public class NumberOfTheDay {
    public static void main(String[] args) {

        int num =15;
        String b;
        if (num>0&&num<8) {
            switch (num) {
                case 1:
                    b = "monday";
                    break;
                case 2:
                    b = "tuesday";
                    break;
                case 3:
                    b = "wednesday";
                    break;
                case 4:
                    b = "thursday";
                    break;
                case 5:
                    b = "friday";
                    break;
                case 6:
                    b = "saturday";
                    break;
                default:
                    b = "sunday";
                    break;

            }
            System.out.println(b);
        }
        else {
            System.err.println("not true");
        }



    }
}

/*
NumberOfDays
28 Days : 2
30 days: 4, 6, 9, 11
31 Days: 1, 3, 5, 7, 10, 12

 */
