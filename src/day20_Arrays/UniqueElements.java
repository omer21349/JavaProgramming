package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        String words[]={"java","java","java","c#","python","python"};

        for (int i = 0; i < words.length; i++) {
         String element=words[i];
         int count=0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(element)){
                    count++;
                }
            }if(count==1){
                System.out.println(element);
            }

        }

    }
}
