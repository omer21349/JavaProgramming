package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A';  i<'Z' ; i++) {
            if (i=='E'){
                continue;
            }System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("---------------------------------------------");

        for (int i = 0; i <=10 ; i++) {
            if (i%2==0){
               continue;
            }System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("------------------------------------");
        for (int j = 0; j <=10 ; j++) {
            if (j%2==1){
                continue;
            }System.out.print(j+" ");
        }
        }

    }

