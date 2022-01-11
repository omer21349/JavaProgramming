package day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {
        String words[]={"java","java","java","c#","python","python"};

        for (String each:words) {
            int cout=0;
            for (String element:words){
                  if (element.equals(each)){
                      cout++;
                  }
            }if (cout==1){
                System.out.println(each);
            }
        }

    }
}
