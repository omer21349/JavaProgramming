package day23_Custommethods_Void;

public class domainEmail {
    public static void main(String[] args) {
        domainEmail("omerguvn@hotmail.com");
    }
    public static void domainEmail(String domain){

        for (int i = 0; i < domain.length(); i++) {

        }
        System.out.println(domain.substring(domain.indexOf("@")));

    }
}
