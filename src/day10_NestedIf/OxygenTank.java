package day10_NestedIf;

public class OxygenTank {
    public static void main(String[] args) {
        int tank=152;
        String a;

        if(tank<=90&&tank>=1){
            if (tank<=40){
                a="Be careful now you are less then 50%";
            }
            else if(tank<=50){
                a="Be careful now you at 50%";
            }
            else if(tank<=60){
                a="Start to head back";
            }
            else if(tank<=70){
                a="Don't go too far";
            }
            else if(tank<=80){
                a="Still okay";
            }
            else{
                a="Your tank is full";
            }
        }
        else {
            a="wrong number";
        }
        System.out.println(a);



    }
}

/*
Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */
