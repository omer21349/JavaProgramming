package day10_NestedIf;

public class NameOfTheMonth {
        public static void main(String[] args) {
            int month= 13;
            String a;

            if (month>=0&&month<=12) {

                if (month==1){
                    a="January";
                }
                else if (month==2){
                    a="February";
                }
                else if (month==3){
                    a="March";
                }
                else if (month==4){
                    a="April";
                }
                else if (month==5){
                    a="May";
                }
                else if (month==6){
                    a="June";
                }
                else if (month==7){
                    a="July";
                }
                else if (month==8){
                    a="August";
                }
                else if (month==9){
                    a="September";
                }
                else if (month==10){
                    a="October";
                }
                else if (month==11){
                    a="November";
                }
                else{
                    a="December";
                }

            }
            else {
                a="wrong number";
            }
            System.out.println(a);

        }
    }
